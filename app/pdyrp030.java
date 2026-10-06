package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdyrp030 extends GXProcedure
{
   public pdyrp030( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdyrp030.class ), "" );
   }

   public pdyrp030( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pdyrp030.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      pdyrp030.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdyrp030.this.AV63BarCod = aP1[0];
      this.aP1 = aP1;
      pdyrp030.this.AV64BarCodReo = aP2[0];
      this.aP2 = aP2;
      pdyrp030.this.AV65BarCodPar = aP3[0];
      this.aP3 = aP3;
      pdyrp030.this.AV38RecLinMaq = aP4[0];
      this.aP4 = aP4;
      pdyrp030.this.AV67StatSedo = aP5[0];
      this.aP5 = aP5;
      pdyrp030.this.AV70FlagOpe = aP6[0];
      this.aP6 = aP6;
      pdyrp030.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV108ErrorMessage = "" ;
      AV111ErrorMessage0 = "" ;
      AV109ErrorMessage1 = "" ;
      AV110ErrorMessage2 = "" ;
      GXt_int1 = AV101carvitin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int2) ;
      pdyrp030.this.GXt_int1 = GXv_int2[0] ;
      AV101carvitin = GXt_int1 ;
      GXt_int3 = AV40ContVal2 ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "SEDOCV", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.prepkil(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      pdyrp030.this.A396EmprCod = GXv_char4[0] ;
      pdyrp030.this.GXt_int3 = GXv_int6[0] ;
      AV40ContVal2 = GXt_int3 ;
      GXt_int1 = AV102SedoCarvitin ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int2) ;
      pdyrp030.this.GXt_int1 = GXv_int2[0] ;
      AV102SedoCarvitin = GXt_int1 ;
      GXt_char7 = AV103pathCv ;
      GXv_char5[0] = GXt_char7 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_char5) ;
      pdyrp030.this.GXt_char7 = GXv_char5[0] ;
      AV103pathCv = GXt_char7 ;
      GXt_char7 = AV104pathRecCv ;
      GXv_char5[0] = GXt_char7 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SRECCV", ""), GXv_char5) ;
      pdyrp030.this.GXt_char7 = GXv_char5[0] ;
      AV104pathRecCv = GXt_char7 ;
      GXt_char7 = AV105pathRecCv2 ;
      GXv_char5[0] = GXt_char7 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "RECCVS", ""), GXv_char5) ;
      pdyrp030.this.GXt_char7 = GXv_char5[0] ;
      AV105pathRecCv2 = GXt_char7 ;
      if ( ( AV101carvitin == 1 ) && ( AV40ContVal2 == 1 ) && ( AV102SedoCarvitin == 1 ) )
      {
         if ( ( GXutil.strcmp(AV103pathCv, " ") != 0 ) && ( GXutil.strcmp(AV104pathRecCv, " ") != 0 ) && ( GXutil.strcmp(AV105pathRecCv2, " ") != 0 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_char4[0] = AV103pathCv ;
            GXv_int8[0] = AV63BarCod ;
            GXv_int2[0] = AV64BarCodReo ;
            GXv_char9[0] = AV65BarCodPar ;
            GXv_int10[0] = AV38RecLinMaq ;
            GXv_char11[0] = AV42Msg_ctrl ;
            GXv_int12[0] = AV67StatSedo ;
            GXv_char13[0] = AV114Pgmname ;
            GXv_char14[0] = AV111ErrorMessage0 ;
            new app.pcarvsedo(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_int8, GXv_int2, GXv_char9, GXv_int10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
            pdyrp030.this.A396EmprCod = GXv_char5[0] ;
            pdyrp030.this.AV103pathCv = GXv_char4[0] ;
            pdyrp030.this.AV63BarCod = GXv_int8[0] ;
            pdyrp030.this.AV64BarCodReo = GXv_int2[0] ;
            pdyrp030.this.AV65BarCodPar = GXv_char9[0] ;
            pdyrp030.this.AV38RecLinMaq = GXv_int10[0] ;
            pdyrp030.this.AV42Msg_ctrl = GXv_char11[0] ;
            pdyrp030.this.AV67StatSedo = GXv_int12[0] ;
            pdyrp030.this.AV114Pgmname = GXv_char13[0] ;
            pdyrp030.this.AV111ErrorMessage0 = GXv_char14[0] ;
            if ( GXutil.strcmp(AV42Msg_ctrl, " ") != 0 )
            {
               httpContext.GX_msglist.addItem(AV42Msg_ctrl);
               AV108ErrorMessage = GXutil.trim( AV111ErrorMessage0) + GXutil.newLine( ) ;
            }
            else
            {
               if ( AV67StatSedo == 3 )
               {
               }
               else
               {
                  GXv_char14[0] = A396EmprCod ;
                  GXv_char13[0] = AV104pathRecCv ;
                  GXv_int8[0] = AV63BarCod ;
                  GXv_int12[0] = AV64BarCodReo ;
                  GXv_char11[0] = AV65BarCodPar ;
                  GXv_int10[0] = AV38RecLinMaq ;
                  GXv_char9[0] = AV109ErrorMessage1 ;
                  new app.ficheroprep(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_int8, GXv_int12, GXv_char11, GXv_int10, GXv_char9) ;
                  pdyrp030.this.A396EmprCod = GXv_char14[0] ;
                  pdyrp030.this.AV104pathRecCv = GXv_char13[0] ;
                  pdyrp030.this.AV63BarCod = GXv_int8[0] ;
                  pdyrp030.this.AV64BarCodReo = GXv_int12[0] ;
                  pdyrp030.this.AV65BarCodPar = GXv_char11[0] ;
                  pdyrp030.this.AV38RecLinMaq = GXv_int10[0] ;
                  pdyrp030.this.AV109ErrorMessage1 = GXv_char9[0] ;
                  GXv_char14[0] = A396EmprCod ;
                  GXv_char13[0] = AV105pathRecCv2 ;
                  GXv_int8[0] = AV63BarCod ;
                  GXv_int12[0] = AV64BarCodReo ;
                  GXv_char11[0] = AV65BarCodPar ;
                  GXv_int10[0] = AV38RecLinMaq ;
                  GXv_char9[0] = AV110ErrorMessage2 ;
                  new app.ficheroprod(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_int8, GXv_int12, GXv_char11, GXv_int10, GXv_char9) ;
                  pdyrp030.this.A396EmprCod = GXv_char14[0] ;
                  pdyrp030.this.AV105pathRecCv2 = GXv_char13[0] ;
                  pdyrp030.this.AV63BarCod = GXv_int8[0] ;
                  pdyrp030.this.AV64BarCodReo = GXv_int12[0] ;
                  pdyrp030.this.AV65BarCodPar = GXv_char11[0] ;
                  pdyrp030.this.AV38RecLinMaq = GXv_int10[0] ;
                  pdyrp030.this.AV110ErrorMessage2 = GXv_char9[0] ;
                  AV108ErrorMessage = GXutil.trim( AV111ErrorMessage0) + GXutil.newLine( ) ;
                  AV108ErrorMessage += GXutil.trim( AV109ErrorMessage1) + GXutil.newLine( ) ;
                  AV108ErrorMessage += GXutil.trim( AV110ErrorMessage2) + GXutil.newLine( ) ;
               }
            }
         }
         else
         {
            Gx_msg = httpContext.getMessage( "Error.Falta algun path ¡¡¡", "") + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Path BATCH ", "") + GXutil.trim( AV103pathCv) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Path PREP  ", "") + GXutil.trim( AV104pathRecCv) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Path PROP  ", "") + GXutil.trim( AV105pathRecCv2) + GXutil.newLine( ) ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdyrp030.this.A396EmprCod;
      this.aP1[0] = pdyrp030.this.AV63BarCod;
      this.aP2[0] = pdyrp030.this.AV64BarCodReo;
      this.aP3[0] = pdyrp030.this.AV65BarCodPar;
      this.aP4[0] = pdyrp030.this.AV38RecLinMaq;
      this.aP5[0] = pdyrp030.this.AV67StatSedo;
      this.aP6[0] = pdyrp030.this.AV70FlagOpe;
      this.aP7[0] = pdyrp030.this.AV108ErrorMessage;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV108ErrorMessage = "" ;
      AV111ErrorMessage0 = "" ;
      AV109ErrorMessage1 = "" ;
      AV110ErrorMessage2 = "" ;
      GXv_int6 = new long[1] ;
      AV103pathCv = "" ;
      AV104pathRecCv = "" ;
      AV105pathRecCv2 = "" ;
      GXt_char7 = "" ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int2 = new byte[1] ;
      AV42Msg_ctrl = "" ;
      AV114Pgmname = "" ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char9 = new String[1] ;
      Gx_msg = "" ;
      AV114Pgmname = "Pdyrp030" ;
      /* GeneXus formulas. */
      AV114Pgmname = "Pdyrp030" ;
      Gx_err = (short)(0) ;
   }

   private byte AV64BarCodReo ;
   private byte AV67StatSedo ;
   private byte AV101carvitin ;
   private byte AV102SedoCarvitin ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte GXv_int12[] ;
   private short AV38RecLinMaq ;
   private short GXv_int10[] ;
   private short Gx_err ;
   private int AV63BarCod ;
   private int GXv_int8[] ;
   private long AV40ContVal2 ;
   private long GXt_int3 ;
   private long GXv_int6[] ;
   private String A396EmprCod ;
   private String AV65BarCodPar ;
   private String AV70FlagOpe ;
   private String AV103pathCv ;
   private String AV104pathRecCv ;
   private String AV105pathRecCv2 ;
   private String GXt_char7 ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String AV42Msg_ctrl ;
   private String AV114Pgmname ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char9[] ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private String AV108ErrorMessage ;
   private String AV111ErrorMessage0 ;
   private String AV109ErrorMessage1 ;
   private String AV110ErrorMessage2 ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private byte[] aP5 ;
   private String[] aP6 ;
}

