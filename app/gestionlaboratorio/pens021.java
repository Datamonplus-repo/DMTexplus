package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens021 extends GXProcedure
{
   public pens021( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens021.class ), "" );
   }

   public pens021( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            String[] aP3 ,
                            String[] aP4 )
   {
      pens021.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      pens021.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens021.this.AV8Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens021.this.AV9Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pens021.this.AV10PrdNum = aP3[0];
      this.aP3 = aP3;
      pens021.this.AV11Tipo = aP4[0];
      this.aP4 = aP4;
      pens021.this.AV12Linea_p = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV14Moda21 ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      pens021.this.GXt_int1 = GXv_int2[0] ;
      AV14Moda21 = GXt_int1 ;
      AV13PrdUMeFo = (byte)(0) ;
      /* Using cursor P01WO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV10PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P01WO2_A719PrdNum[0] ;
         A4338PrdUMeFo = P01WO2_A4338PrdUMeFo[0] ;
         AV13PrdUMeFo = A4338PrdUMeFo ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV11Tipo, httpContext.getMessage( "C", "")) == 0 )
      {
         AV12Linea_p = (short)(0) ;
         /* Using cursor P01WO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Lb_numero), AV9Lb_opcion});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A5555Lb_opcion = P01WO3_A5555Lb_opcion[0] ;
            A5532Lb_numero = P01WO3_A5532Lb_numero[0] ;
            A5556Lb_UltLC = P01WO3_A5556Lb_UltLC[0] ;
            AV12Linea_p = A5556Lb_UltLC ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV12Linea_p = (short)(AV12Linea_p+10) ;
         /*
            INSERT RECORD ON TABLE TXPENS003

         */
         A5532Lb_numero = AV8Lb_numero ;
         A5555Lb_opcion = AV9Lb_opcion ;
         A5557Lb_LineaC = AV12Linea_p ;
         A719PrdNum = AV10PrdNum ;
         A490ForPrdUMe = (byte)(3) ;
         A5558LB_CantC = DecimalUtil.doubleToDec(0) ;
         A6544Lb_PTinC = (byte)(((AV14Moda21==1) ? 0 : 1)) ;
         /* Using cursor P01WO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5557Lb_LineaC), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5558LB_CantC, Byte.valueOf(A6544Lb_PTinC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS003");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Optimized UPDATE. */
         /* Using cursor P01WO5 */
         pr_default.execute(3, new Object[] {Short.valueOf(AV12Linea_p), A396EmprCod, Integer.valueOf(AV8Lb_numero), AV9Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* End optimized UPDATE. */
      }
      else
      {
         AV12Linea_p = (short)(0) ;
         /* Using cursor P01WO6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV8Lb_numero), AV9Lb_opcion});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A5555Lb_opcion = P01WO6_A5555Lb_opcion[0] ;
            A5532Lb_numero = P01WO6_A5532Lb_numero[0] ;
            A5559Lb_UltlP = P01WO6_A5559Lb_UltlP[0] ;
            AV12Linea_p = A5559Lb_UltlP ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
         AV12Linea_p = (short)(AV12Linea_p+10) ;
         /*
            INSERT RECORD ON TABLE TXPENS004

         */
         A5532Lb_numero = AV8Lb_numero ;
         A5555Lb_opcion = AV9Lb_opcion ;
         A5560Lb_LineaPr = AV12Linea_p ;
         A719PrdNum = AV10PrdNum ;
         A490ForPrdUMe = AV13PrdUMeFo ;
         A5561LB_CantP = DecimalUtil.doubleToDec(0) ;
         A5562Lb_orden = (short)(0) ;
         A6545Lb_PTinP = (byte)(((AV14Moda21==1) ? 0 : 1)) ;
         /* Using cursor P01WO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion, Short.valueOf(A5560Lb_LineaPr), A719PrdNum, Byte.valueOf(A490ForPrdUMe), A5561LB_CantP, Short.valueOf(A5562Lb_orden), Byte.valueOf(A6545Lb_PTinP)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS004");
         if ( (pr_default.getStatus(5) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         /* Optimized UPDATE. */
         /* Using cursor P01WO8 */
         pr_default.execute(6, new Object[] {Short.valueOf(AV12Linea_p), A396EmprCod, Integer.valueOf(AV8Lb_numero), AV9Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens021.this.A396EmprCod;
      this.aP1[0] = pens021.this.AV8Lb_numero;
      this.aP2[0] = pens021.this.AV9Lb_opcion;
      this.aP3[0] = pens021.this.AV10PrdNum;
      this.aP4[0] = pens021.this.AV11Tipo;
      this.aP5[0] = pens021.this.AV12Linea_p;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pens021");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01WO2_A396EmprCod = new String[] {""} ;
      P01WO2_A719PrdNum = new String[] {""} ;
      P01WO2_A4338PrdUMeFo = new byte[1] ;
      A719PrdNum = "" ;
      P01WO3_A396EmprCod = new String[] {""} ;
      P01WO3_A5555Lb_opcion = new String[] {""} ;
      P01WO3_A5532Lb_numero = new int[1] ;
      P01WO3_A5556Lb_UltLC = new short[1] ;
      A5555Lb_opcion = "" ;
      A5558LB_CantC = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P01WO6_A396EmprCod = new String[] {""} ;
      P01WO6_A5555Lb_opcion = new String[] {""} ;
      P01WO6_A5532Lb_numero = new int[1] ;
      P01WO6_A5559Lb_UltlP = new short[1] ;
      A5561LB_CantP = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pens021__default(),
         new Object[] {
             new Object[] {
            P01WO2_A396EmprCod, P01WO2_A719PrdNum, P01WO2_A4338PrdUMeFo
            }
            , new Object[] {
            P01WO3_A396EmprCod, P01WO3_A5555Lb_opcion, P01WO3_A5532Lb_numero, P01WO3_A5556Lb_UltLC
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01WO6_A396EmprCod, P01WO6_A5555Lb_opcion, P01WO6_A5532Lb_numero, P01WO6_A5559Lb_UltlP
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14Moda21 ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV13PrdUMeFo ;
   private byte A4338PrdUMeFo ;
   private byte A490ForPrdUMe ;
   private byte A6544Lb_PTinC ;
   private byte A6545Lb_PTinP ;
   private short AV12Linea_p ;
   private short A5556Lb_UltLC ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private short A5559Lb_UltlP ;
   private short A5560Lb_LineaPr ;
   private short A5562Lb_orden ;
   private int AV8Lb_numero ;
   private int A5532Lb_numero ;
   private int GX_INS820 ;
   private int GX_INS821 ;
   private java.math.BigDecimal A5558LB_CantC ;
   private java.math.BigDecimal A5561LB_CantP ;
   private String A396EmprCod ;
   private String AV9Lb_opcion ;
   private String AV10PrdNum ;
   private String AV11Tipo ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A5555Lb_opcion ;
   private String Gx_emsg ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01WO2_A396EmprCod ;
   private String[] P01WO2_A719PrdNum ;
   private byte[] P01WO2_A4338PrdUMeFo ;
   private String[] P01WO3_A396EmprCod ;
   private String[] P01WO3_A5555Lb_opcion ;
   private int[] P01WO3_A5532Lb_numero ;
   private short[] P01WO3_A5556Lb_UltLC ;
   private String[] P01WO6_A396EmprCod ;
   private String[] P01WO6_A5555Lb_opcion ;
   private int[] P01WO6_A5532Lb_numero ;
   private short[] P01WO6_A5559Lb_UltlP ;
}

final  class pens021__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01WO2", "SELECT EmprCod, PrdNum, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01WO3", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltLC FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WO4", "INSERT INTO TXPENS003(EmprCod, Lb_numero, Lb_opcion, Lb_LineaC, PrdNum, ForPrdUMe, LB_CantC, Lb_PTinC, Lb_soluc, Lb_fibra) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS003")
         ,new UpdateCursor("P01WO5", "UPDATE TXPENS002 SET Lb_UltLC=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
         ,new ForEachCursor("P01WO6", "SELECT EmprCod, Lb_opcion, Lb_numero, Lb_UltlP FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01WO7", "INSERT INTO TXPENS004(EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr, PrdNum, ForPrdUMe, LB_CantP, Lb_orden, Lb_PTinP, Lb_solup) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS004")
         ,new UpdateCursor("P01WO8", "UPDATE TXPENS002 SET Lb_UltlP=?  WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               return;
            case 6 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

