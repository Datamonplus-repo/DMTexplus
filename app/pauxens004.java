package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pauxens004 extends GXProcedure
{
   public pauxens004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pauxens004.class ), "" );
   }

   public pauxens004( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           String[] aP1 ,
                           java.math.BigDecimal[] aP2 ,
                           int[] aP3 ,
                           String[] aP4 ,
                           byte[] aP5 ,
                           byte[] aP6 )
   {
      pauxens004.this.aP7 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 ,
                        byte[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 ,
                             byte[] aP7 )
   {
      pauxens004.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pauxens004.this.AV8Lb_TaAuxC = aP1[0];
      this.aP1 = aP1;
      pauxens004.this.AV9SumColor = aP2[0];
      this.aP2 = aP2;
      pauxens004.this.AV10Lb_numero = aP3[0];
      this.aP3 = aP3;
      pauxens004.this.AV11Lb_opcion = aP4[0];
      this.aP4 = aP4;
      pauxens004.this.AV12Lb_famc1 = aP5[0];
      this.aP5 = aP5;
      pauxens004.this.AV13Lb_famc2 = aP6[0];
      this.aP6 = aP6;
      pauxens004.this.AV14Lb_famc3 = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24UsurCod = " " ;
      AV25Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV26EmprNom ;
      GXv_char3[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char1, GXv_char2, GXv_char3) ;
      pauxens004.this.A396EmprCod = GXv_char1[0] ;
      pauxens004.this.AV26EmprNom = GXv_char2[0] ;
      pauxens004.this.AV24UsurCod = GXv_char3[0] ;
      GXt_int4 = AV15OtraformaAux ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "IN0AUX", ""), GXv_int5) ;
      pauxens004.this.GXt_int4 = GXv_int5[0] ;
      AV15OtraformaAux = GXt_int4 ;
      AV22TotalColorante = AV9SumColor ;
      GXv_char3[0] = A396EmprCod ;
      GXv_decimal6[0] = AV22TotalColorante ;
      GXv_int7[0] = AV10Lb_numero ;
      GXv_char2[0] = AV11Lb_opcion ;
      GXv_int5[0] = AV12Lb_famc1 ;
      GXv_int8[0] = AV13Lb_famc2 ;
      GXv_int9[0] = AV14Lb_famc3 ;
      GXv_int10[0] = AV21Err_sumc ;
      GXv_int11[0] = AV23Nfibra ;
      new app.psumfibracolorante(remoteHandle, context).execute( GXv_char3, GXv_decimal6, GXv_int7, GXv_char2, GXv_int5, GXv_int8, GXv_int9, GXv_int10, GXv_int11) ;
      pauxens004.this.A396EmprCod = GXv_char3[0] ;
      pauxens004.this.AV22TotalColorante = GXv_decimal6[0] ;
      pauxens004.this.AV10Lb_numero = GXv_int7[0] ;
      pauxens004.this.AV11Lb_opcion = GXv_char2[0] ;
      pauxens004.this.AV12Lb_famc1 = GXv_int5[0] ;
      pauxens004.this.AV13Lb_famc2 = GXv_int8[0] ;
      pauxens004.this.AV14Lb_famc3 = GXv_int9[0] ;
      pauxens004.this.AV21Err_sumc = GXv_int10[0] ;
      pauxens004.this.AV23Nfibra = GXv_int11[0] ;
      if ( AV15OtraformaAux == 0 )
      {
      }
      else
      {
         /* Using cursor P06092 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5555Lb_opcion = P06092_A5555Lb_opcion[0] ;
            A5532Lb_numero = P06092_A5532Lb_numero[0] ;
            A5559Lb_UltlP = P06092_A5559Lb_UltlP[0] ;
            AV17Lb_lineaPr = A5559Lb_UltlP ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_char3[0] = A396EmprCod ;
         GXv_int7[0] = AV10Lb_numero ;
         GXv_char2[0] = AV11Lb_opcion ;
         GXv_int11[0] = AV16Lprfor ;
         GXv_int10[0] = AV23Nfibra ;
         new app.psiauxlprfor(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_char2, GXv_int11, GXv_int10) ;
         pauxens004.this.A396EmprCod = GXv_char3[0] ;
         pauxens004.this.AV10Lb_numero = GXv_int7[0] ;
         pauxens004.this.AV11Lb_opcion = GXv_char2[0] ;
         pauxens004.this.AV16Lprfor = GXv_int11[0] ;
         pauxens004.this.AV23Nfibra = GXv_int10[0] ;
         if ( AV16Lprfor == 1 )
         {
            AV19Ok = httpContext.getMessage( "N", "") ;
            Gx_msg = httpContext.getMessage( "Atencion.Existen PRODUCTOS para la Fibra ", "") + GXutil.str( AV23Nfibra, 2, 0) + httpContext.getMessage( " ,ELIMINANOS?", "") ;
            if ( GXutil.strcmp(GXutil.upper( AV19Ok), httpContext.getMessage( "S", "")) == 0 )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int7[0] = AV10Lb_numero ;
               GXv_char2[0] = AV11Lb_opcion ;
               GXv_int11[0] = AV23Nfibra ;
               new app.pdelauxlprfor(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_char2, GXv_int11) ;
               pauxens004.this.A396EmprCod = GXv_char3[0] ;
               pauxens004.this.AV10Lb_numero = GXv_int7[0] ;
               pauxens004.this.AV11Lb_opcion = GXv_char2[0] ;
               pauxens004.this.AV23Nfibra = GXv_int11[0] ;
            }
         }
         AV17Lb_lineaPr = (short)(AV17Lb_lineaPr+10) ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = AV8Lb_TaAuxC ;
         GXv_decimal6[0] = AV22TotalColorante ;
         GXv_int7[0] = AV10Lb_numero ;
         GXv_char1[0] = AV11Lb_opcion ;
         GXv_int11[0] = (byte)(0) ;
         GXv_int10[0] = (byte)(0) ;
         GXv_int9[0] = (byte)(0) ;
         GXv_int12[0] = AV17Lb_lineaPr ;
         GXv_int8[0] = (byte)(1) ;
         GXv_int5[0] = AV18InsAux ;
         GXv_int13[0] = AV23Nfibra ;
         new app.pinsauxtablaalcalis(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_decimal6, GXv_int7, GXv_char1, GXv_int11, GXv_int10, GXv_int9, GXv_int12, GXv_int8, GXv_int5, GXv_int13) ;
         pauxens004.this.A396EmprCod = GXv_char3[0] ;
         pauxens004.this.AV8Lb_TaAuxC = GXv_char2[0] ;
         pauxens004.this.AV22TotalColorante = GXv_decimal6[0] ;
         pauxens004.this.AV10Lb_numero = GXv_int7[0] ;
         pauxens004.this.AV11Lb_opcion = GXv_char1[0] ;
         pauxens004.this.AV17Lb_lineaPr = GXv_int12[0] ;
         pauxens004.this.AV18InsAux = GXv_int5[0] ;
         pauxens004.this.AV23Nfibra = GXv_int13[0] ;
         /* Using cursor P06093 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5555Lb_opcion = P06093_A5555Lb_opcion[0] ;
            A5532Lb_numero = P06093_A5532Lb_numero[0] ;
            A5559Lb_UltlP = P06093_A5559Lb_UltlP[0] ;
            A6310Lb_TaAuxC = P06093_A6310Lb_TaAuxC[0] ;
            n6310Lb_TaAuxC = P06093_n6310Lb_TaAuxC[0] ;
            A6373Lb_famc1 = P06093_A6373Lb_famc1[0] ;
            A6374Lb_famc2 = P06093_A6374Lb_famc2[0] ;
            A6375Lb_famc3 = P06093_A6375Lb_famc3[0] ;
            A5559Lb_UltlP = AV17Lb_lineaPr ;
            if ( GXutil.strcmp(AV8Lb_TaAuxC, " ") != 0 )
            {
               AV27inc_obs = httpContext.getMessage( "Inicializo Tabla alcalis, ", "") + AV8Lb_TaAuxC + GXutil.newLine( ) ;
               AV27inc_obs += httpContext.getMessage( "inicializo Familias ", "") + GXutil.str( AV12Lb_famc1, 2, 0) + " " + GXutil.str( AV13Lb_famc2, 2, 0) + " " + GXutil.str( AV14Lb_famc3, 2, 0) ;
               A6310Lb_TaAuxC = "" ;
               n6310Lb_TaAuxC = false ;
               A6373Lb_famc1 = (byte)(0) ;
               A6374Lb_famc2 = (byte)(0) ;
               A6375Lb_famc3 = (byte)(0) ;
               new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV33Pgmname, AV24UsurCod, AV25Station, AV27inc_obs, AV10Lb_numero, (byte)(0), AV11Lb_opcion) ;
            }
            /* Using cursor P06094 */
            pr_default.execute(2, new Object[] {Short.valueOf(A5559Lb_UltlP), Boolean.valueOf(n6310Lb_TaAuxC), A6310Lb_TaAuxC, Byte.valueOf(A6373Lb_famc1), Byte.valueOf(A6374Lb_famc2), Byte.valueOf(A6375Lb_famc3), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pauxens004.this.A396EmprCod;
      this.aP1[0] = pauxens004.this.AV8Lb_TaAuxC;
      this.aP2[0] = pauxens004.this.AV9SumColor;
      this.aP3[0] = pauxens004.this.AV10Lb_numero;
      this.aP4[0] = pauxens004.this.AV11Lb_opcion;
      this.aP5[0] = pauxens004.this.AV12Lb_famc1;
      this.aP6[0] = pauxens004.this.AV13Lb_famc2;
      this.aP7[0] = pauxens004.this.AV14Lb_famc3;
      Application.commitDataStores(context, remoteHandle, pr_default, "pauxens004");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24UsurCod = "" ;
      AV25Station = "" ;
      AV26EmprNom = "" ;
      AV22TotalColorante = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P06092_A396EmprCod = new String[] {""} ;
      P06092_A5555Lb_opcion = new String[] {""} ;
      P06092_A5532Lb_numero = new int[1] ;
      P06092_A5559Lb_UltlP = new short[1] ;
      A5555Lb_opcion = "" ;
      AV19Ok = "" ;
      Gx_msg = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_char1 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int12 = new short[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int13 = new byte[1] ;
      P06093_A396EmprCod = new String[] {""} ;
      P06093_A5555Lb_opcion = new String[] {""} ;
      P06093_A5532Lb_numero = new int[1] ;
      P06093_A5559Lb_UltlP = new short[1] ;
      P06093_A6310Lb_TaAuxC = new String[] {""} ;
      P06093_n6310Lb_TaAuxC = new boolean[] {false} ;
      P06093_A6373Lb_famc1 = new byte[1] ;
      P06093_A6374Lb_famc2 = new byte[1] ;
      P06093_A6375Lb_famc3 = new byte[1] ;
      A6310Lb_TaAuxC = "" ;
      AV27inc_obs = "" ;
      AV33Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pauxens004__default(),
         new Object[] {
             new Object[] {
            P06092_A396EmprCod, P06092_A5555Lb_opcion, P06092_A5532Lb_numero, P06092_A5559Lb_UltlP
            }
            , new Object[] {
            P06093_A396EmprCod, P06093_A5555Lb_opcion, P06093_A5532Lb_numero, P06093_A5559Lb_UltlP, P06093_A6310Lb_TaAuxC, P06093_n6310Lb_TaAuxC, P06093_A6373Lb_famc1, P06093_A6374Lb_famc2, P06093_A6375Lb_famc3
            }
            , new Object[] {
            }
         }
      );
      AV33Pgmname = "PAuxENS004" ;
      /* GeneXus formulas. */
      AV33Pgmname = "PAuxENS004" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12Lb_famc1 ;
   private byte AV13Lb_famc2 ;
   private byte AV14Lb_famc3 ;
   private byte AV15OtraformaAux ;
   private byte GXt_int4 ;
   private byte AV21Err_sumc ;
   private byte AV23Nfibra ;
   private byte AV16Lprfor ;
   private byte GXv_int11[] ;
   private byte GXv_int10[] ;
   private byte GXv_int9[] ;
   private byte GXv_int8[] ;
   private byte AV18InsAux ;
   private byte GXv_int5[] ;
   private byte GXv_int13[] ;
   private byte A6373Lb_famc1 ;
   private byte A6374Lb_famc2 ;
   private byte A6375Lb_famc3 ;
   private short A5559Lb_UltlP ;
   private short AV17Lb_lineaPr ;
   private short GXv_int12[] ;
   private short Gx_err ;
   private int AV10Lb_numero ;
   private int A5532Lb_numero ;
   private int GXv_int7[] ;
   private java.math.BigDecimal AV9SumColor ;
   private java.math.BigDecimal AV22TotalColorante ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private String A396EmprCod ;
   private String AV8Lb_TaAuxC ;
   private String AV11Lb_opcion ;
   private String AV24UsurCod ;
   private String AV25Station ;
   private String AV26EmprNom ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String AV19Ok ;
   private String Gx_msg ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String A6310Lb_TaAuxC ;
   private String AV33Pgmname ;
   private boolean n6310Lb_TaAuxC ;
   private String AV27inc_obs ;
   private byte[] aP7 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private int[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private byte[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P06092_A396EmprCod ;
   private String[] P06092_A5555Lb_opcion ;
   private int[] P06092_A5532Lb_numero ;
   private short[] P06092_A5559Lb_UltlP ;
   private String[] P06093_A396EmprCod ;
   private String[] P06093_A5555Lb_opcion ;
   private int[] P06093_A5532Lb_numero ;
   private short[] P06093_A5559Lb_UltlP ;
   private String[] P06093_A6310Lb_TaAuxC ;
   private boolean[] P06093_n6310Lb_TaAuxC ;
   private byte[] P06093_A6373Lb_famc1 ;
   private byte[] P06093_A6374Lb_famc2 ;
   private byte[] P06093_A6375Lb_famc3 ;
}

final  class pauxens004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06092", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltlP FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06093", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltlP, Lb_TaAuxC, Lb_famc1, Lb_famc2, Lb_famc3 FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P06094", "UPDATE TXPENS002 SET Lb_UltlP=?, Lb_TaAuxC=?, Lb_famc1=?, Lb_famc2=?, Lb_famc3=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setString(8, (String)parms[8], 1);
               return;
      }
   }

}

