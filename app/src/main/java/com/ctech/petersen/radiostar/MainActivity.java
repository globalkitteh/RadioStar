package com.ctech.petersen.radiostar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/*public class MainActivity extends YouTubeFailureRecoveryActivity implements
        View.OnClickListener,
        TextView.OnEditorActionListener,
        CompoundButton.OnCheckedChangeListener,
        AdapterView.OnItemSelectedListener {

    private static final PlayerControlsDemoActivity.ListEntry[] ENTRIES = {
            new PlayerControlsDemoActivity.ListEntry("Androidify App", "irH3OSOskcE", false),
            new PlayerControlsDemoActivity.ListEntry("Chrome Speed Tests", "nCgQDjiotG0", false),
            new PlayerControlsDemoActivity.ListEntry("Playlist: Google I/O 2012", "PL56D792A831D0C362", true)};

    private static final String KEY_CURRENTLY_SELECTED_ID = "currentlySelectedId";

    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer player;
    private TextView stateText;
    private ArrayAdapter<PlayerControlsDemoActivity.ListEntry> videoAdapter;
    private Spinner videoChooser;
    private Button playButton;
    private Button pauseButton;
    private EditText skipTo;
    private TextView eventLog;
    private StringBuilder logString;
    private RadioGroup styleRadioGroup;

    private PlayerControlsDemoActivity.MyPlaylistEventListener playlistEventListener;
    private PlayerControlsDemoActivity.MyPlayerStateChangeListener playerStateChangeListener;
    private PlayerControlsDemoActivity.MyPlaybackEventListener playbackEventListener;

    private int currentlySelectedPosition;
    private String currentlySelectedId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.player_controls_demo);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        stateText = (TextView) findViewById(R.id.state_text);
        videoChooser = (Spinner) findViewById(R.id.video_chooser);
        playButton = (Button) findViewById(R.id.play_button);
        pauseButton = (Button) findViewById(R.id.pause_button);
        skipTo = (EditText) findViewById(R.id.skip_to_text);
        eventLog = (TextView) findViewById(R.id.event_log);

        styleRadioGroup = (RadioGroup) findViewById(R.id.style_radio_group);
        ((RadioButton) findViewById(R.id.style_default)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.style_minimal)).setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.style_chromeless)).setOnCheckedChangeListener(this);
        logString = new StringBuilder();

        videoAdapter = new ArrayAdapter<PlayerControlsDemoActivity.ListEntry>(this, android.R.layout.simple_spinner_item, ENTRIES);
        videoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        videoChooser.setOnItemSelectedListener(this);
        videoChooser.setAdapter(videoAdapter);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
        skipTo.setOnEditorActionListener(this);

        youTubePlayerView.initialize(DeveloperKey.DEVELOPER_KEY, this);

        playlistEventListener = new PlayerControlsDemoActivity.MyPlaylistEventListener();
        playerStateChangeListener = new PlayerControlsDemoActivity.MyPlayerStateChangeListener();
        playbackEventListener = new PlayerControlsDemoActivity.MyPlaybackEventListener();

        setControlsEnabled(false);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {
        this.player = player;
        player.setPlaylistEventListener(playlistEventListener);
        player.setPlayerStateChangeListener(playerStateChangeListener);
        player.setPlaybackEventListener(playbackEventListener);

        if (!wasRestored) {
            playVideoAtSelection();
        }
        setControlsEnabled(true);
    }

    @Override
    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return youTubePlayerView;
    }

    private void playVideoAtSelection() {
        PlayerControlsDemoActivity.ListEntry selectedEntry = videoAdapter.getItem(currentlySelectedPosition);
        if (selectedEntry.id != currentlySelectedId && player != null) {
            currentlySelectedId = selectedEntry.id;
            if (selectedEntry.isPlaylist) {
                player.cuePlaylist(selectedEntry.id);
            } else {
                player.cueVideo(selectedEntry.id);
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        currentlySelectedPosition = pos;
        playVideoAtSelection();
    }

    private EditText vidTitle;
    private static final String API_KEY = "AIzaSyDd30ot3W9T-DJGYlypX75kUruWuNqzCfI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button intent_demo_button;

        intent_demo_button = findViewById(R.id.intent_demo);

        private YouTubePlayerView youTubePlayerView;
        private YouTubePlayer player;
    }
}*/

