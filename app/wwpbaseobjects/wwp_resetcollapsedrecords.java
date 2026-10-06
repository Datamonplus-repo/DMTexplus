package app.wwpbaseobjects ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wwp_resetcollapsedrecords extends GXProcedure
{
   public wwp_resetcollapsedrecords( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_resetcollapsedrecords.class ), "" );
   }

   public wwp_resetcollapsedrecords( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( app.wwpbaseobjects.SdtWWPGridState aP0 ,
                              app.wwpbaseobjects.SdtWWPGridState aP1 )
   {
      wwp_resetcollapsedrecords.this.aP2 = new boolean[] {false};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( app.wwpbaseobjects.SdtWWPGridState aP0 ,
                        app.wwpbaseobjects.SdtWWPGridState aP1 ,
                        boolean[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( app.wwpbaseobjects.SdtWWPGridState aP0 ,
                             app.wwpbaseobjects.SdtWWPGridState aP1 ,
                             boolean[] aP2 )
   {
      wwp_resetcollapsedrecords.this.AV9OldGridState = aP0;
      wwp_resetcollapsedrecords.this.AV10NewGridState = aP1;
      wwp_resetcollapsedrecords.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9OldGridState.setgxTv_SdtWWPGridState_Orderedby( AV10NewGridState.getgxTv_SdtWWPGridState_Orderedby() );
      AV9OldGridState.setgxTv_SdtWWPGridState_Ordereddsc( AV10NewGridState.getgxTv_SdtWWPGridState_Ordereddsc() );
      AV9OldGridState.setgxTv_SdtWWPGridState_Currentpage( AV10NewGridState.getgxTv_SdtWWPGridState_Currentpage() );
      AV9OldGridState.setgxTv_SdtWWPGridState_Pagesize( AV10NewGridState.getgxTv_SdtWWPGridState_Pagesize() );
      AV9OldGridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV10NewGridState.getgxTv_SdtWWPGridState_Collapsedrecords() );
      if ( GXutil.strcmp(AV9OldGridState.toJSonString(false, true), AV10NewGridState.toJSonString(false, true)) != 0 )
      {
         AV8Reset = true ;
      }
      else
      {
         AV8Reset = false ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = wwp_resetcollapsedrecords.this.AV8Reset;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private boolean AV8Reset ;
   private boolean[] aP2 ;
   private app.wwpbaseobjects.SdtWWPGridState AV9OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV10NewGridState ;
}

