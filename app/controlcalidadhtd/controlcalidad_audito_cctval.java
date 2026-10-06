package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_audito_cctval extends GXProcedure
{
   public controlcalidad_audito_cctval( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_audito_cctval.class ), "" );
   }

   public controlcalidad_audito_cctval( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      controlcalidad_audito_cctval.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      controlcalidad_audito_cctval.this.A396EmprCod = aP0;
      controlcalidad_audito_cctval.this.A4031CCTCod = aP1;
      controlcalidad_audito_cctval.this.A4034CCTLin = aP2;
      controlcalidad_audito_cctval.this.AV11CCVal = aP3;
      controlcalidad_audito_cctval.this.aP4 = aP4;
      controlcalidad_audito_cctval.this.aP5 = aP5;
      controlcalidad_audito_cctval.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8mensaje = "" ;
      AV9var_ok = (byte)(1) ;
      AV14Mask = "" ;
      /* Using cursor P0APU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4044CCTLinTpoD = P0APU2_A4044CCTLinTpoD[0] ;
         A4045CCTLinLgoD = P0APU2_A4045CCTLinLgoD[0] ;
         A4046CCTLinPict = P0APU2_A4046CCTLinPict[0] ;
         if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "N", "")) == 0 )
         {
            AV17valor = GXutil.trim( AV11CCVal) ;
            AV21Length = DecimalUtil.doubleToDec(GXutil.len( AV17valor)) ;
            AV18EsNumerico = true ;
            AV19i = (short)(1) ;
            while ( AV19i <= AV21Length.doubleValue() )
            {
               AV20c = GXutil.substring( AV17valor, AV19i, 1) ;
               if ( ! ( ( GXutil.strcmp(AV20c, "0") == 0 ) || ( GXutil.strcmp(AV20c, "1") == 0 ) || ( GXutil.strcmp(AV20c, "2") == 0 ) || ( GXutil.strcmp(AV20c, "3") == 0 ) || ( GXutil.strcmp(AV20c, "4") == 0 ) || ( GXutil.strcmp(AV20c, "5") == 0 ) || ( GXutil.strcmp(AV20c, "6") == 0 ) || ( GXutil.strcmp(AV20c, "7") == 0 ) || ( GXutil.strcmp(AV20c, "8") == 0 ) || ( GXutil.strcmp(AV20c, "9") == 0 ) || ( GXutil.strcmp(AV20c, ".") == 0 ) ) )
               {
                  AV18EsNumerico = false ;
                  if (true) break;
               }
               AV19i = (short)(AV19i+1) ;
            }
            if ( ! AV18EsNumerico )
            {
               AV8mensaje = httpContext.getMessage( "Debe ingresar un valor numérico.", "") ;
               AV9var_ok = (byte)(0) ;
               if ( AV21Length.doubleValue() > A4045CCTLinLgoD )
               {
                  AV8mensaje = (GXutil.format( httpContext.getMessage( "Máximo %1 caracteres", ""), GXutil.ltrimstr( DecimalUtil.doubleToDec(A4045CCTLinLgoD), 3, 0), "", "", "", "", "", "", "", "")) ;
                  AV9var_ok = (byte)(0) ;
               }
               else
               {
                  AV22Puntos = (short)(0) ;
                  AV21Length = DecimalUtil.doubleToDec(GXutil.len( AV11CCVal)) ;
                  AV19i = (short)(1) ;
                  while ( AV19i <= AV21Length.doubleValue() )
                  {
                     if ( GXutil.strcmp(GXutil.substring( AV23CCTVal, AV19i, 1), ".") == 0 )
                     {
                        AV22Puntos = (short)(AV22Puntos+1) ;
                     }
                     AV19i = (short)(AV19i+1) ;
                  }
                  if ( AV22Puntos > 1 )
                  {
                     AV8mensaje = httpContext.getMessage( "Formato numérico inválido", "") ;
                     AV9var_ok = (byte)(0) ;
                  }
               }
            }
         }
         if ( ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "F", "")) == 0 ) && ( AV9var_ok == 1 ) )
         {
            if ( ! ( GXutil.strcmp(GXutil.trim( localUtil.dtoc( localUtil.ctod( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( AV11CCVal)) == 0 ) )
            {
               AV8mensaje = httpContext.getMessage( "El valor ideal debe ser fecha.", "") ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( GXutil.strcmp(A4044CCTLinTpoD, httpContext.getMessage( "H", "")) == 0 )
         {
            if ( ! ( GXutil.strcmp(GXutil.trim( localUtil.ttoc( localUtil.ctot( AV11CCVal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), 0, A4045CCTLinLgoD, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( AV11CCVal)) == 0 ) && ( AV9var_ok == 1 ) )
            {
               AV8mensaje = httpContext.getMessage( "El valor ideal debe ser hora.", "") ;
               AV9var_ok = (byte)(0) ;
            }
         }
         if ( AV9var_ok == 1 )
         {
            GXt_char1 = AV14Mask ;
            GXv_char2[0] = A4046CCTLinPict ;
            GXv_int3[0] = A4045CCTLinLgoD ;
            GXv_char4[0] = GXt_char1 ;
            new app.controlcalidadhtd.pccmask(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4) ;
            controlcalidad_audito_cctval.this.A4046CCTLinPict = GXv_char2[0] ;
            controlcalidad_audito_cctval.this.A4045CCTLinLgoD = (short)((short)(GXv_int3[0])) ;
            controlcalidad_audito_cctval.this.GXt_char1 = GXv_char4[0] ;
            AV14Mask = GXt_char1 ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = controlcalidad_audito_cctval.this.AV8mensaje;
      this.aP5[0] = controlcalidad_audito_cctval.this.AV9var_ok;
      this.aP6[0] = controlcalidad_audito_cctval.this.AV14Mask;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8mensaje = "" ;
      AV14Mask = "" ;
      scmdbuf = "" ;
      P0APU2_A396EmprCod = new String[] {""} ;
      P0APU2_A4031CCTCod = new int[1] ;
      P0APU2_A4034CCTLin = new short[1] ;
      P0APU2_A4044CCTLinTpoD = new String[] {""} ;
      P0APU2_A4045CCTLinLgoD = new short[1] ;
      P0APU2_A4046CCTLinPict = new String[] {""} ;
      A4044CCTLinTpoD = "" ;
      A4046CCTLinPict = "" ;
      AV17valor = "" ;
      AV21Length = DecimalUtil.ZERO ;
      AV20c = "" ;
      AV23CCTVal = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new long[1] ;
      GXv_char4 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_audito_cctval__default(),
         new Object[] {
             new Object[] {
            P0APU2_A396EmprCod, P0APU2_A4031CCTCod, P0APU2_A4034CCTLin, P0APU2_A4044CCTLinTpoD, P0APU2_A4045CCTLinLgoD, P0APU2_A4046CCTLinPict
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9var_ok ;
   private short A4034CCTLin ;
   private short A4045CCTLinLgoD ;
   private short AV19i ;
   private short AV22Puntos ;
   private short Gx_err ;
   private int A4031CCTCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal AV21Length ;
   private String A396EmprCod ;
   private String AV11CCVal ;
   private String scmdbuf ;
   private String A4044CCTLinTpoD ;
   private String A4046CCTLinPict ;
   private String AV17valor ;
   private String AV20c ;
   private String AV23CCTVal ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private boolean AV18EsNumerico ;
   private String AV8mensaje ;
   private String AV14Mask ;
   private String[] aP6 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0APU2_A396EmprCod ;
   private int[] P0APU2_A4031CCTCod ;
   private short[] P0APU2_A4034CCTLin ;
   private String[] P0APU2_A4044CCTLinTpoD ;
   private short[] P0APU2_A4045CCTLinLgoD ;
   private String[] P0APU2_A4046CCTLinPict ;
}

final  class controlcalidad_audito_cctval__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0APU2", "SELECT EmprCod, CCTCod, CCTLin, CCTLinTpoD, CCTLinLgoD, CCTLinPict FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? and CCTLin = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

