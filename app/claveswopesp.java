package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class claveswopesp extends GXProcedure
{
   public claveswopesp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( claveswopesp.class ), "" );
   }

   public claveswopesp( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      claveswopesp.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      claveswopesp.this.AV13EmprCod = aP0[0];
      this.aP0 = aP0;
      claveswopesp.this.AV8OpEspCod = aP1[0];
      this.aP1 = aP1;
      claveswopesp.this.aP2 = aP2;
      claveswopesp.this.AV10PrdMaxFind = aP3[0];
      this.aP3 = aP3;
      claveswopesp.this.AV11ProForUli = aP4[0];
      this.aP4 = aP4;
      claveswopesp.this.AV12ProForClv = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV8OpEspCod == 1 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.formulaciontinte.procesosquimicos_claves_matiz_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else if ( AV8OpEspCod == 2 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.webwopesfi", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else if ( AV8OpEspCod == 3 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.webwopesco", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else if ( AV8OpEspCod == 4 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.webwopestc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else if ( AV8OpEspCod == 5 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.webwopesrb", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else if ( AV8OpEspCod == 6 )
      {
         /* Window Datatype Object Property */
         AV14window.setUrl( formatLink("app.webwopesat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV9ProForCla)),GXutil.URLEncode(GXutil.rtrim(AV10PrdMaxFind)),GXutil.URLEncode(GXutil.ltrimstr(AV11ProForUli,4,0))}, new String[] {"EmprCod","ProForCla","PrdMaxFind","ProForUli"})  );
         AV14window.setReturnParms(new Object[] {"AV13EmprCod","AV9ProForCla","AV10PrdMaxFind","AV11ProForUli",});
         AV14window.setWidth( 900 );
         AV14window.setHeight( 1200 );
         httpContext.newWindow(AV14window);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = claveswopesp.this.AV13EmprCod;
      this.aP1[0] = claveswopesp.this.AV8OpEspCod;
      this.aP2[0] = claveswopesp.this.AV9ProForCla;
      this.aP3[0] = claveswopesp.this.AV10PrdMaxFind;
      this.aP4[0] = claveswopesp.this.AV11ProForUli;
      this.aP5[0] = claveswopesp.this.AV12ProForClv;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9ProForCla = "" ;
      AV14window = new com.genexus.webpanels.GXWindow();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8OpEspCod ;
   private short AV11ProForUli ;
   private short Gx_err ;
   private String AV13EmprCod ;
   private String AV9ProForCla ;
   private String AV10PrdMaxFind ;
   private String AV12ProForClv ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWindow AV14window ;
   private String[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
}

