package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc171 extends GXProcedure
{
   public pprc171( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc171.class ), "" );
   }

   public pprc171( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pprc171.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pprc171.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc171.this.AV14Discod = aP1[0];
      this.aP1 = aP1;
      pprc171.this.AV8oldObs = aP2[0];
      this.aP2 = aP2;
      pprc171.this.AV9DisObsLin = aP3[0];
      this.aP3 = aP3;
      pprc171.this.AV10DisObsTxt = aP4[0];
      this.aP4 = aP4;
      pprc171.this.AV11usurcod = aP5[0];
      this.aP5 = aP5;
      pprc171.this.AV12station = aP6[0];
      this.aP6 = aP6;
      pprc171.this.Gx_mode = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "DLT", "")) == 0 )
      {
         AV13Inc_obs = httpContext.getMessage( "Linea Observacion, Eliminada= ", "") + GXutil.str( AV9DisObsLin, 1, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Obs. ", "") + GXutil.trim( AV10DisObsTxt) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV11usurcod, AV12station, AV13Inc_obs, AV14Discod, (byte)(0), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 )
      {
         AV13Inc_obs = httpContext.getMessage( "Linea Observacion, Alta= ", "") + GXutil.str( AV9DisObsLin, 1, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Obs. ", "") + AV10DisObsTxt ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV11usurcod, AV12station, AV13Inc_obs, AV14Discod, (byte)(0), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         AV13Inc_obs = httpContext.getMessage( "Linea Observacion, Modificada= ", "") + GXutil.str( AV9DisObsLin, 1, 0) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "Obs. ", "") + GXutil.trim( AV8oldObs) + GXutil.newLine( ) ;
         AV13Inc_obs += httpContext.getMessage( "cambia a ", "") + AV10DisObsTxt ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV18Pgmname, AV11usurcod, AV12station, AV13Inc_obs, AV14Discod, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc171.this.A396EmprCod;
      this.aP1[0] = pprc171.this.AV14Discod;
      this.aP2[0] = pprc171.this.AV8oldObs;
      this.aP3[0] = pprc171.this.AV9DisObsLin;
      this.aP4[0] = pprc171.this.AV10DisObsTxt;
      this.aP5[0] = pprc171.this.AV11usurcod;
      this.aP6[0] = pprc171.this.AV12station;
      this.aP7[0] = pprc171.this.Gx_mode;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV13Inc_obs = "" ;
      AV18Pgmname = "" ;
      AV18Pgmname = "PPrc171" ;
      /* GeneXus formulas. */
      AV18Pgmname = "PPrc171" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9DisObsLin ;
   private short Gx_err ;
   private int AV14Discod ;
   private String A396EmprCod ;
   private String AV8oldObs ;
   private String AV10DisObsTxt ;
   private String AV11usurcod ;
   private String AV12station ;
   private String Gx_mode ;
   private String AV18Pgmname ;
   private String AV13Inc_obs ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
}

