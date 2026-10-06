package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class palmdab extends GXProcedure
{
   public palmdab( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( palmdab.class ), "" );
   }

   public palmdab( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           String[] aP1 ,
                                           String[] aP2 ,
                                           java.math.BigDecimal[] aP3 ,
                                           java.math.BigDecimal[] aP4 ,
                                           short[] aP5 )
   {
      palmdab.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        short[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             short[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      palmdab.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      palmdab.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      palmdab.this.AV18UniMed = aP2[0];
      this.aP2 = aP2;
      palmdab.this.AV19BarKgm = aP3[0];
      this.aP3 = aP3;
      palmdab.this.AV20BarMtr = aP4[0];
      this.aP4 = aP4;
      palmdab.this.AV21PrdTipArt = aP5[0];
      this.aP5 = aP5;
      palmdab.this.AV17Exis = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(DecimalUtil.decToDouble(AV27Nclec)) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCLEC", ""), GXv_int2) ;
      palmdab.this.GXt_int1 = GXv_int2[0] ;
      AV27Nclec = DecimalUtil.doubleToDec(GXt_int1) ;
      /* Using cursor P00SR2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A724PrdPreAct = P00SR2_A724PrdPreAct[0] ;
         A3915EmpNumDec = P00SR2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SR2_n3915EmpNumDec[0] ;
         A3915EmpNumDec = P00SR2_A3915EmpNumDec[0] ;
         n3915EmpNumDec = P00SR2_n3915EmpNumDec[0] ;
         AV22PrdPreAct = A724PrdPreAct ;
         AV24EmpNumDec = A3915EmpNumDec ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "1.New", "") );
      /*
         INSERT RECORD ON TABLE TXPCPRDES

      */
      A681PrdAny = (short)(GXutil.year( GXutil.today( ))) ;
      A331DifValConA = DecimalUtil.doubleToDec(0) ;
      n331DifValConA = false ;
      /* Using cursor P00SR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Boolean.valueOf(n331DifValConA), A331DifValConA});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPRDES");
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
      System.out.println( httpContext.getMessage( "2.New", "") );
      /*
         INSERT RECORD ON TABLE TXPLPRDES

      */
      A681PrdAny = (short)(GXutil.year( GXutil.today( ))) ;
      A720PrdNumMes = (byte)(GXutil.month( GXutil.today( ))) ;
      A3659PrdKilTin = AV19BarKgm ;
      if ( GXutil.strcmp(AV18UniMed, httpContext.getMessage( "M", "")) == 0 )
      {
         A3660PrdMtrTin = AV20BarMtr ;
      }
      /* Using cursor P00SR4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes), A3659PrdKilTin, A3660PrdMtrTin});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
      if ( (pr_default.getStatus(2) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         /* Using cursor P00SR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A396EmprCod = P00SR5_A396EmprCod[0] ;
            A719PrdNum = P00SR5_A719PrdNum[0] ;
            A681PrdAny = P00SR5_A681PrdAny[0] ;
            A720PrdNumMes = P00SR5_A720PrdNumMes[0] ;
            A3659PrdKilTin = P00SR5_A3659PrdKilTin[0] ;
            A3660PrdMtrTin = P00SR5_A3660PrdMtrTin[0] ;
            A3659PrdKilTin = A3659PrdKilTin.add(AV19BarKgm) ;
            if ( GXutil.strcmp(AV18UniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               A3660PrdMtrTin = A3660PrdMtrTin.add(AV20BarMtr) ;
            }
            /* Using cursor P00SR6 */
            pr_default.execute(4, new Object[] {A3659PrdKilTin, A3660PrdMtrTin, A396EmprCod, A719PrdNum, Short.valueOf(A681PrdAny), Byte.valueOf(A720PrdNumMes)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPRDES");
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
      if ( AV27Nclec.doubleValue() == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "palmdab");
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = palmdab.this.A396EmprCod;
      this.aP1[0] = palmdab.this.A719PrdNum;
      this.aP2[0] = palmdab.this.AV18UniMed;
      this.aP3[0] = palmdab.this.AV19BarKgm;
      this.aP4[0] = palmdab.this.AV20BarMtr;
      this.aP5[0] = palmdab.this.AV21PrdTipArt;
      this.aP6[0] = palmdab.this.AV17Exis;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV27Nclec = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P00SR2_A396EmprCod = new String[] {""} ;
      P00SR2_A719PrdNum = new String[] {""} ;
      P00SR2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SR2_A3915EmpNumDec = new byte[1] ;
      P00SR2_n3915EmpNumDec = new boolean[] {false} ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV22PrdPreAct = DecimalUtil.ZERO ;
      A331DifValConA = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      A3659PrdKilTin = DecimalUtil.ZERO ;
      A3660PrdMtrTin = DecimalUtil.ZERO ;
      P00SR5_A396EmprCod = new String[] {""} ;
      P00SR5_A719PrdNum = new String[] {""} ;
      P00SR5_A681PrdAny = new short[1] ;
      P00SR5_A720PrdNumMes = new byte[1] ;
      P00SR5_A3659PrdKilTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00SR5_A3660PrdMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.palmdab__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.palmdab__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.palmdab__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.palmdab__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.palmdab__default(),
         new Object[] {
             new Object[] {
            P00SR2_A396EmprCod, P00SR2_A719PrdNum, P00SR2_A724PrdPreAct, P00SR2_A3915EmpNumDec, P00SR2_n3915EmpNumDec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00SR5_A396EmprCod, P00SR5_A719PrdNum, P00SR5_A681PrdAny, P00SR5_A720PrdNumMes, P00SR5_A3659PrdKilTin, P00SR5_A3660PrdMtrTin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A3915EmpNumDec ;
   private byte AV24EmpNumDec ;
   private byte A720PrdNumMes ;
   private short AV21PrdTipArt ;
   private short A681PrdAny ;
   private short Gx_err ;
   private int GX_INS80 ;
   private int GX_INS81 ;
   private java.math.BigDecimal AV19BarKgm ;
   private java.math.BigDecimal AV20BarMtr ;
   private java.math.BigDecimal AV17Exis ;
   private java.math.BigDecimal AV27Nclec ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV22PrdPreAct ;
   private java.math.BigDecimal A331DifValConA ;
   private java.math.BigDecimal A3659PrdKilTin ;
   private java.math.BigDecimal A3660PrdMtrTin ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV18UniMed ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private boolean n3915EmpNumDec ;
   private boolean n331DifValConA ;
   private java.math.BigDecimal[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00SR2_A396EmprCod ;
   private String[] P00SR2_A719PrdNum ;
   private java.math.BigDecimal[] P00SR2_A724PrdPreAct ;
   private byte[] P00SR2_A3915EmpNumDec ;
   private boolean[] P00SR2_n3915EmpNumDec ;
   private String[] P00SR5_A396EmprCod ;
   private String[] P00SR5_A719PrdNum ;
   private short[] P00SR5_A681PrdAny ;
   private byte[] P00SR5_A720PrdNumMes ;
   private java.math.BigDecimal[] P00SR5_A3659PrdKilTin ;
   private java.math.BigDecimal[] P00SR5_A3660PrdMtrTin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class palmdab__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class palmdab__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class palmdab__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class palmdab__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class palmdab__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00SR2", "SELECT T1.EmprCod, T1.PrdNum, T1.PrdPreAct, T2.EmpNumDec FROM (TXPPRODUC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00SR3", "INSERT INTO TXPCPRDES(EmprCod, PrdNum, PrdAny, DifValConA, PrdAcuConA) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPRDES")
         ,new UpdateCursor("P00SR4", "INSERT INTO TXPLPRDES(EmprCod, PrdNum, PrdAny, PrdNumMes, PrdKilTin, PrdMtrTin, PrdUniCprM, PrdUniConM, PrdValCprM, PrdValConM) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
         ,new ForEachCursor("P00SR5", "SELECT EmprCod, PrdNum, PrdAny, PrdNumMes, PrdKilTin, PrdMtrTin FROM TXPLPRDES WHERE EmprCod = ? and PrdNum = ? and PrdAny = ? and PrdNumMes = ? ORDER BY EmprCod, PrdNum, PrdAny, PrdNumMes  FOR UPDATE OF PrdKilTin, PrdMtrTin NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00SR6", "UPDATE TXPLPRDES SET PrdKilTin=?, PrdMtrTin=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdAny = ? AND PrdNumMes = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPRDES")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
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
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 4);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

