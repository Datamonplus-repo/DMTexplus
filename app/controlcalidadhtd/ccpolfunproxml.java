package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ccpolfunproxml extends GXProcedure
{
   public ccpolfunproxml( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ccpolfunproxml.class ), "" );
   }

   public ccpolfunproxml( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[][] executeUdp( String aP0 ,
                                 long[] aP1 ,
                                 String[][] AV10Funcion ,
                                 String[][] AV17ParNom )
   {
      AV18ParTpo = new String[200][4] ;
      GX_I = 1 ;
      while ( GX_I <= 200 )
      {
         GX_J = 1 ;
         while ( GX_J <= 4 )
         {
            AV18ParTpo[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, AV10Funcion, AV17ParNom, AV18ParTpo);
      return AV18ParTpo;
   }

   public void execute( String aP0 ,
                        long[] aP1 ,
                        String[][] AV10Funcion ,
                        String[][] AV17ParNom ,
                        String[][] AV18ParTpo )
   {
      execute_int(aP0, aP1, AV10Funcion, AV17ParNom, AV18ParTpo);
   }

   private void execute_int( String aP0 ,
                             long[] aP1 ,
                             String[][] AV10Funcion ,
                             String[][] AV17ParNom ,
                             String[][] AV18ParTpo )
   {
      ccpolfunproxml.this.AV20Txt = aP0;
      ccpolfunproxml.this.aP1 = aP1;
      ccpolfunproxml.this.AV10Funcion = AV10Funcion;
      ccpolfunproxml.this.AV17ParNom = AV17ParNom;
      ccpolfunproxml.this.AV18ParTpo = AV18ParTpo;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Pos = 1 ;
      AV23nReg = (short)(1) ;
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Inicia Localización de variables en XML ", ""), "", "", "", "", "", "", "", "", ""), AV28Pgmname) ;
      while ( AV23nReg < 200 )
      {
         GXt_int1 = AV11Ini ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.atxml(remoteHandle, context).execute( AV20Txt, "[%", 0, GXv_int2) ;
         ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
         AV11Ini = GXt_int1 ;
         GXt_int1 = AV9Fin ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.atxml(remoteHandle, context).execute( AV20Txt, "%]", 2, GXv_int2) ;
         ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
         AV9Fin = GXt_int1 ;
         AV13Len = (long)(AV9Fin-AV11Ini) ;
         if ( AV13Len < 0 )
         {
            AV12IniXML = AV9Fin ;
            AV14LenXML = (long)(GXutil.len( AV20Txt)-AV12IniXML) ;
            AV20Txt = GXutil.substring( AV20Txt, (int)(AV12IniXML), (int)(AV14LenXML)) ;
         }
         else
         {
            AV10Funcion[(int)(AV19Pos)-1][2-1] = GXutil.substring( AV20Txt, (int)(AV11Ini), (int)(AV13Len)) ;
            AV22vMsgPos = GXutil.substring( AV20Txt, (int)(AV11Ini), (int)(AV13Len)) ;
            if ( AV11Ini > 0 )
            {
               new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Encontrada variables Ini:%1,Fin:%2,Len:%3,Funcion:%4", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Ini), 10, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Fin), 10, 0), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Len), 10, 0), AV22vMsgPos, "", "", "", "", ""), AV28Pgmname) ;
            }
            AV12IniXML = AV9Fin ;
            AV14LenXML = (long)(GXutil.len( AV20Txt)-AV12IniXML) ;
            AV20Txt = GXutil.substring( AV20Txt, (int)(AV12IniXML), (int)(AV14LenXML)) ;
            GXt_int1 = AV11Ini ;
            GXv_int2[0] = GXt_int1 ;
            new app.core.atxml(remoteHandle, context).execute( AV10Funcion[(int)(AV19Pos)-1][2-1], "(", 0, GXv_int2) ;
            ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
            AV11Ini = GXt_int1 ;
            AV13Len = (long)(AV11Ini-3) ;
            AV10Funcion[(int)(AV19Pos)-1][1-1] = GXutil.substring( AV10Funcion[(int)(AV19Pos)-1][2-1], 3, (int)(AV13Len)) ;
            AV22vMsgPos = GXutil.substring( AV10Funcion[(int)(AV19Pos)-1][2-1], 3, (int)(AV13Len)) ;
            if ( GXutil.strcmp(GXutil.trim( AV10Funcion[(int)(AV19Pos)-1][1-1]), httpContext.getMessage( "VAR33", "")) == 0 )
            {
               AV23nReg = (short)(199) ;
            }
            GXt_int1 = AV9Fin ;
            GXv_int2[0] = GXt_int1 ;
            new app.core.atxml(remoteHandle, context).execute( AV10Funcion[(int)(AV19Pos)-1][2-1], ")", 1, GXv_int2) ;
            ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
            AV9Fin = GXt_int1 ;
            AV11Ini = (long)(AV11Ini+1) ;
            AV13Len = (long)(AV9Fin-AV11Ini) ;
            AV15Par = GXutil.substring( AV10Funcion[(int)(AV19Pos)-1][2-1], (int)(AV11Ini), (int)(AV13Len)) ;
            AV22vMsgPos = GXutil.substring( AV10Funcion[(int)(AV19Pos)-1][2-1], (int)(AV11Ini), (int)(AV13Len)) ;
            if ( GXutil.len( AV15Par) == 0 )
            {
               AV10Funcion[(int)(AV19Pos)-1][3-1] = "" ;
            }
            else
            {
               AV16ParCont = 1 ;
               while ( AV16ParCont <= 4 )
               {
                  if ( AV16ParCont == 1 )
                  {
                     AV11Ini = 1 ;
                  }
                  else
                  {
                     GXt_int1 = AV11Ini ;
                     GXv_int2[0] = GXt_int1 ;
                     new app.core.atxml(remoteHandle, context).execute( AV15Par, ",", 1, GXv_int2) ;
                     ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
                     AV11Ini = GXt_int1 ;
                  }
                  GXt_int1 = AV9Fin ;
                  GXv_int2[0] = GXt_int1 ;
                  new app.core.atxml(remoteHandle, context).execute( AV15Par, "(", 0, GXv_int2) ;
                  ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
                  AV9Fin = GXt_int1 ;
                  AV13Len = (long)(AV9Fin-AV11Ini) ;
                  AV18ParTpo[(int)(AV19Pos)-1][(int)(AV16ParCont)-1] = GXutil.substring( AV15Par, (int)(AV11Ini), (int)(AV13Len)) ;
                  GXt_int1 = AV11Ini ;
                  GXv_int2[0] = GXt_int1 ;
                  new app.core.atxml(remoteHandle, context).execute( AV15Par, "(", 1, GXv_int2) ;
                  ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
                  AV11Ini = GXt_int1 ;
                  GXt_int1 = AV9Fin ;
                  GXv_int2[0] = GXt_int1 ;
                  new app.core.atxml(remoteHandle, context).execute( AV15Par, ")", 0, GXv_int2) ;
                  ccpolfunproxml.this.GXt_int1 = GXv_int2[0] ;
                  AV9Fin = GXt_int1 ;
                  AV13Len = (long)(AV9Fin-AV11Ini) ;
                  AV17ParNom[(int)(AV19Pos)-1][(int)(AV16ParCont)-1] = GXutil.substring( AV15Par, (int)(AV11Ini), (int)(AV13Len)) ;
                  AV24IniPar = (long)((AV9Fin+1)) ;
                  AV25LenPar = (long)(GXutil.len( AV15Par)-AV24IniPar) ;
                  AV15Par = GXutil.substring( AV15Par, (int)(AV24IniPar), (int)(AV25LenPar)) ;
                  AV16ParCont = (long)(AV16ParCont+1) ;
               }
               AV10Funcion[(int)(AV19Pos)-1][3-1] = GXutil.str( AV16ParCont-1, 10, 0) ;
            }
            if ( ! (GXutil.strcmp("", AV22vMsgPos)==0) )
            {
               AV19Pos = (long)(AV19Pos+1) ;
            }
            AV23nReg = (short)(AV23nReg+1) ;
         }
      }
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).debug(GXutil.format( httpContext.getMessage( "Finaliza Localización de variables, encontradas %1 variables", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Pos), 10, 0), "", "", "", "", "", "", "", ""), AV28Pgmname) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = ccpolfunproxml.this.AV19Pos;
      this.AV10Funcion = ccpolfunproxml.this.AV10Funcion;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV28Pgmname = "" ;
      AV22vMsgPos = "" ;
      AV15Par = "" ;
      GXv_int2 = new long[1] ;
      AV28Pgmname = "ControlCalidadHTD.CCPolFunProXML" ;
      /* GeneXus formulas. */
      AV28Pgmname = "ControlCalidadHTD.CCPolFunProXML" ;
      Gx_err = (short)(0) ;
   }

   private short AV23nReg ;
   private short Gx_err ;
   private int GX_I ;
   private int GX_J ;
   private long AV19Pos ;
   private long AV11Ini ;
   private long AV9Fin ;
   private long AV13Len ;
   private long AV12IniXML ;
   private long AV14LenXML ;
   private long AV16ParCont ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long AV24IniPar ;
   private long AV25LenPar ;
   private String AV17ParNom[][] ;
   private String AV28Pgmname ;
   private String AV22vMsgPos ;
   private String AV15Par ;
   private String AV20Txt ;
   private String[][] AV18ParTpo ;
   private long[] aP1 ;
   private String[][] AV10Funcion ;
}

