package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pentpro extends GXProcedure
{
   public pentpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pentpro.class ), "" );
   }

   public pentpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      pentpro.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        byte[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             byte[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             String[] aP7 )
   {
      pentpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pentpro.this.A795PrvNum = aP1[0];
      this.aP1 = aP1;
      pentpro.this.A779PrvAny = aP2[0];
      this.aP2 = aP2;
      pentpro.this.A796PrvNumLin = aP3[0];
      this.aP3 = aP3;
      pentpro.this.AV17Unidades = aP4[0];
      this.aP4 = aP4;
      pentpro.this.AV15UniOld = aP5[0];
      this.aP5 = aP5;
      pentpro.this.AV16Precio = aP6[0];
      this.aP6 = aP6;
      pentpro.this.AV18Prioridad = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00412 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3915EmpNumDec = P00412_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00412_n3915EmpNumDec[0] ;
         AV19EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /*
         INSERT RECORD ON TABLE TXPCPRVES

      */
      A330DifEstCa1 = DecimalUtil.doubleToDec(0) ;
      n330DifEstCa1 = false ;
      /* Using cursor P00413 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Boolean.valueOf(n330DifEstCa1), A330DifEstCa1});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRVES");
      if ( (pr_default.getStatus(1) == 1) )
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
      /*
         INSERT RECORD ON TABLE TXPLPRVES

      */
      if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
      {
         if ( AV19EmpNumDec == 0 )
         {
            A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
            n790PrvEstCm0 = false ;
         }
         else
         {
            if ( AV19EmpNumDec == 2 )
            {
               A790PrvEstCm0 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
               n790PrvEstCm0 = false ;
            }
         }
         A791PrvEstCm1 = DecimalUtil.doubleToDec(0) ;
         n791PrvEstCm1 = false ;
      }
      else
      {
         if ( AV19EmpNumDec == 0 )
         {
            A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 0) ;
            n791PrvEstCm1 = false ;
         }
         else
         {
            if ( AV19EmpNumDec == 2 )
            {
               A791PrvEstCm1 = GXutil.roundDecimal( AV16Precio.multiply(AV17Unidades), 2) ;
               n791PrvEstCm1 = false ;
            }
         }
         A790PrvEstCm0 = DecimalUtil.doubleToDec(0) ;
         n790PrvEstCm0 = false ;
      }
      /* Using cursor P00414 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin), Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P00415 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P00415_A396EmprCod[0] ;
            A795PrvNum = P00415_A795PrvNum[0] ;
            A779PrvAny = P00415_A779PrvAny[0] ;
            A796PrvNumLin = P00415_A796PrvNumLin[0] ;
            A790PrvEstCm0 = P00415_A790PrvEstCm0[0] ;
            n790PrvEstCm0 = P00415_n790PrvEstCm0[0] ;
            A791PrvEstCm1 = P00415_A791PrvEstCm1[0] ;
            n791PrvEstCm1 = P00415_n791PrvEstCm1[0] ;
            if ( GXutil.strcmp(AV18Prioridad, "0") == 0 )
            {
               if ( AV19EmpNumDec == 0 )
               {
                  A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 0)) ;
                  n790PrvEstCm0 = false ;
               }
               else
               {
                  if ( AV19EmpNumDec == 2 )
                  {
                     A790PrvEstCm0 = A790PrvEstCm0.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 2)) ;
                     n790PrvEstCm0 = false ;
                  }
               }
            }
            else
            {
               if ( AV19EmpNumDec == 0 )
               {
                  A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 0)) ;
                  n791PrvEstCm1 = false ;
               }
               else
               {
                  if ( AV19EmpNumDec == 2 )
                  {
                     A791PrvEstCm1 = A791PrvEstCm1.add(GXutil.roundDecimal( AV16Precio.multiply((AV17Unidades.subtract(AV15UniOld))), 2)) ;
                     n791PrvEstCm1 = false ;
                  }
               }
            }
            /* Using cursor P00416 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n790PrvEstCm0), A790PrvEstCm0, Boolean.valueOf(n791PrvEstCm1), A791PrvEstCm1, A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(A796PrvNumLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRVES");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pentpro.this.A396EmprCod;
      this.aP1[0] = pentpro.this.A795PrvNum;
      this.aP2[0] = pentpro.this.A779PrvAny;
      this.aP3[0] = pentpro.this.A796PrvNumLin;
      this.aP4[0] = pentpro.this.AV17Unidades;
      this.aP5[0] = pentpro.this.AV15UniOld;
      this.aP6[0] = pentpro.this.AV16Precio;
      this.aP7[0] = pentpro.this.AV18Prioridad;
      Application.commitDataStores(context, remoteHandle, pr_default, "pentpro");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P00412_A396EmprCod = new String[] {""} ;
      P00412_A3915EmpNumDec = new byte[1] ;
      P00412_n3915EmpNumDec = new boolean[] {false} ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      P00415_A396EmprCod = new String[] {""} ;
      P00415_A795PrvNum = new int[1] ;
      P00415_A779PrvAny = new short[1] ;
      P00415_A796PrvNumLin = new byte[1] ;
      P00415_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00415_n790PrvEstCm0 = new boolean[] {false} ;
      P00415_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00415_n791PrvEstCm1 = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pentpro__default(),
         new Object[] {
             new Object[] {
            P00412_A396EmprCod, P00412_A3915EmpNumDec, P00412_n3915EmpNumDec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00415_A396EmprCod, P00415_A795PrvNum, P00415_A779PrvAny, P00415_A796PrvNumLin, P00415_A790PrvEstCm0, P00415_n790PrvEstCm0, P00415_A791PrvEstCm1, P00415_n791PrvEstCm1
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A796PrvNumLin ;
   private byte A3915EmpNumDec ;
   private byte AV19EmpNumDec ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int GX_INS92 ;
   private int GX_INS93 ;
   private java.math.BigDecimal AV17Unidades ;
   private java.math.BigDecimal AV15UniOld ;
   private java.math.BigDecimal AV16Precio ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private String A396EmprCod ;
   private String AV18Prioridad ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean n3915EmpNumDec ;
   private boolean n330DifEstCa1 ;
   private boolean n790PrvEstCm0 ;
   private boolean n791PrvEstCm1 ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private byte[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00412_A396EmprCod ;
   private byte[] P00412_A3915EmpNumDec ;
   private boolean[] P00412_n3915EmpNumDec ;
   private String[] P00415_A396EmprCod ;
   private int[] P00415_A795PrvNum ;
   private short[] P00415_A779PrvAny ;
   private byte[] P00415_A796PrvNumLin ;
   private java.math.BigDecimal[] P00415_A790PrvEstCm0 ;
   private boolean[] P00415_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P00415_A791PrvEstCm1 ;
   private boolean[] P00415_n791PrvEstCm1 ;
}

final  class pentpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00412", "SELECT EmprCod, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00413", "INSERT INTO TXPCPRVES(EmprCod, PrvNum, PrvAny, DifEstCa1) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRVES")
         ,new UpdateCursor("P00414", "INSERT INTO TXPLPRVES(EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1, PrvDevMes) VALUES(?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
         ,new ForEachCursor("P00415", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin  FOR UPDATE OF PrvEstCm0, PrvEstCm1 NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00416", "UPDATE TXPLPRVES SET PrvEstCm0=?, PrvEstCm1=?  WHERE EmprCod = ? AND PrvNum = ? AND PrvAny = ? AND PrvNumLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRVES")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setShort(5, ((Number) parms[6]).shortValue());
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

