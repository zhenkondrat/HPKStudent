package com.example.x4stack.hpkstudent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shpak on 16.04.15.
 */
public class ReplacementAdapter extends RecyclerView.Adapter<ReplacementAdapter.ReplacementHolder> {

    @Override
    public ReplacementHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.replacement_view, viewGroup, false);
        return new ReplacementHolder(view);
    }

    @Override
    public void onBindViewHolder(ReplacementHolder holder, final int i) {
        Replacement replacement= ReplacementFragment.replacements.get(i);

        holder.group.setText(replacement.getGroup());
        holder.numbOfLesson.setText(replacement.getLessonNumber());
        holder.whosRaplacement.setText(replacement.getWhosRaplacement());
        holder.lesson.setText(replacement.getLesson());
        holder.teacher.setText(replacement.getTeacher());
        holder.classRoom.setText(replacement.getClassRoom());
    }

    @Override
    public int getItemCount() {
        return ReplacementFragment.replacements.size();
    }

    public static class ReplacementHolder extends RecyclerView.ViewHolder {
        public TextView group, numbOfLesson,whosRaplacement,lesson,teacher,classRoom;

        public ReplacementHolder(View view) {
            super(view);
            group = (TextView) view.findViewById(R.id.group);
            numbOfLesson = (TextView) view.findViewById(R.id.numbOfLesson);
            whosRaplacement = (TextView) view.findViewById(R.id.whosRaplacement);
            lesson = (TextView) view.findViewById(R.id.lesson);
            teacher = (TextView) view.findViewById(R.id.teacher);
            classRoom = (TextView) view.findViewById(R.id.classRoom);
        }
    }
}
