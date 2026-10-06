package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptaruni extends GXProcedure
{
   public ptaruni( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptaruni.class ), "" );
   }

   public ptaruni( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 )
   {
      ptaruni.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      ptaruni.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptaruni.this.AV8CliCod = aP1[0];
      this.aP1 = aP1;
      ptaruni.this.AV9RecTipCon = aP2[0];
      this.aP2 = aP2;
      ptaruni.this.AV13Limite3 = aP3[0];
      this.aP3 = aP3;
      ptaruni.this.AV12Opcion = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando a todos los clientes", "") );
      /* Using cursor P02OU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod), Short.valueOf(AV9RecTipCon), Short.valueOf(AV13Limite3)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2935Limite3 = P02OU2_A2935Limite3[0] ;
         A2933RecTipCon = P02OU2_A2933RecTipCon[0] ;
         A252CliCod = P02OU2_A252CliCod[0] ;
         A2934RecTipDsc = P02OU2_A2934RecTipDsc[0] ;
         n2934RecTipDsc = P02OU2_n2934RecTipDsc[0] ;
         A2936Precio3 = P02OU2_A2936Precio3[0] ;
         n2936Precio3 = P02OU2_n2936Precio3[0] ;
         A5043PorBon3 = P02OU2_A5043PorBon3[0] ;
         n5043PorBon3 = P02OU2_n5043PorBon3[0] ;
         A2934RecTipDsc = P02OU2_A2934RecTipDsc[0] ;
         n2934RecTipDsc = P02OU2_n2934RecTipDsc[0] ;
         AV16RecTipDsc = A2934RecTipDsc ;
         AV11Precio3 = A2936Precio3 ;
         AV14PorBon3 = A5043PorBon3 ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P02OU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P02OU3_A252CliCod[0] ;
         AV10CliCodTar = A252CliCod ;
         AV17Texto = httpContext.getMessage( "Actualizo Cliente: ", "") + GXutil.str( AV10CliCodTar, 6, 0) ;
         System.out.println( AV17Texto );
         if ( GXutil.strcmp(AV12Opcion, httpContext.getMessage( "B", "")) == 0 )
         {
            /* Execute user subroutine: 'BAJA' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'ACTUALIZA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BAJA' Routine */
      returnInSub = false ;
      /* Optimized DELETE. */
      /* Using cursor P02OU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCodTar), Short.valueOf(AV9RecTipCon), Short.valueOf(AV13Limite3)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
      /* End optimized DELETE. */
   }

   public void S121( )
   {
      /* 'ACTUALIZA' Routine */
      returnInSub = false ;
      AV15Modif = (byte)(0) ;
      /* Using cursor P02OU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV10CliCodTar), Short.valueOf(AV9RecTipCon), Short.valueOf(AV13Limite3)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A2935Limite3 = P02OU5_A2935Limite3[0] ;
         A2933RecTipCon = P02OU5_A2933RecTipCon[0] ;
         A252CliCod = P02OU5_A252CliCod[0] ;
         A2936Precio3 = P02OU5_A2936Precio3[0] ;
         n2936Precio3 = P02OU5_n2936Precio3[0] ;
         A5043PorBon3 = P02OU5_A5043PorBon3[0] ;
         n5043PorBon3 = P02OU5_n5043PorBon3[0] ;
         AV15Modif = (byte)(1) ;
         A2936Precio3 = AV11Precio3 ;
         n2936Precio3 = false ;
         A5043PorBon3 = AV14PorBon3 ;
         n5043PorBon3 = false ;
         /* Using cursor P02OU6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n2936Precio3), A2936Precio3, Boolean.valueOf(n5043PorBon3), A5043PorBon3, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV15Modif == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPCRECON

         */
         A252CliCod = AV10CliCodTar ;
         A2933RecTipCon = AV9RecTipCon ;
         A2934RecTipDsc = AV16RecTipDsc ;
         n2934RecTipDsc = false ;
         /* Using cursor P02OU7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Boolean.valueOf(n2934RecTipDsc), A2934RecTipDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRECON");
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
         /*
            INSERT RECORD ON TABLE TXPLRECON

         */
         A252CliCod = AV10CliCodTar ;
         A2933RecTipCon = AV9RecTipCon ;
         A2935Limite3 = AV13Limite3 ;
         A2936Precio3 = AV11Precio3 ;
         n2936Precio3 = false ;
         A5043PorBon3 = AV14PorBon3 ;
         n5043PorBon3 = false ;
         /* Using cursor P02OU8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A2933RecTipCon), Short.valueOf(A2935Limite3), Boolean.valueOf(n2936Precio3), A2936Precio3, Boolean.valueOf(n5043PorBon3), A5043PorBon3});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECON");
         if ( (pr_default.getStatus(6) == 1) )
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
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptaruni.this.A396EmprCod;
      this.aP1[0] = ptaruni.this.AV8CliCod;
      this.aP2[0] = ptaruni.this.AV9RecTipCon;
      this.aP3[0] = ptaruni.this.AV13Limite3;
      this.aP4[0] = ptaruni.this.AV12Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "ptaruni");
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
      P02OU2_A396EmprCod = new String[] {""} ;
      P02OU2_A2935Limite3 = new short[1] ;
      P02OU2_A2933RecTipCon = new short[1] ;
      P02OU2_A252CliCod = new int[1] ;
      P02OU2_A2934RecTipDsc = new String[] {""} ;
      P02OU2_n2934RecTipDsc = new boolean[] {false} ;
      P02OU2_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OU2_n2936Precio3 = new boolean[] {false} ;
      P02OU2_A5043PorBon3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OU2_n5043PorBon3 = new boolean[] {false} ;
      A2934RecTipDsc = "" ;
      A2936Precio3 = DecimalUtil.ZERO ;
      A5043PorBon3 = DecimalUtil.ZERO ;
      AV16RecTipDsc = "" ;
      AV11Precio3 = DecimalUtil.ZERO ;
      AV14PorBon3 = DecimalUtil.ZERO ;
      P02OU3_A396EmprCod = new String[] {""} ;
      P02OU3_A252CliCod = new int[1] ;
      AV17Texto = "" ;
      P02OU5_A396EmprCod = new String[] {""} ;
      P02OU5_A2935Limite3 = new short[1] ;
      P02OU5_A2933RecTipCon = new short[1] ;
      P02OU5_A252CliCod = new int[1] ;
      P02OU5_A2936Precio3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OU5_n2936Precio3 = new boolean[] {false} ;
      P02OU5_A5043PorBon3 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02OU5_n5043PorBon3 = new boolean[] {false} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptaruni__default(),
         new Object[] {
             new Object[] {
            P02OU2_A396EmprCod, P02OU2_A2935Limite3, P02OU2_A2933RecTipCon, P02OU2_A252CliCod, P02OU2_A2934RecTipDsc, P02OU2_n2934RecTipDsc, P02OU2_A2936Precio3, P02OU2_n2936Precio3, P02OU2_A5043PorBon3, P02OU2_n5043PorBon3
            }
            , new Object[] {
            P02OU3_A396EmprCod, P02OU3_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02OU5_A396EmprCod, P02OU5_A2935Limite3, P02OU5_A2933RecTipCon, P02OU5_A252CliCod, P02OU5_A2936Precio3, P02OU5_n2936Precio3, P02OU5_A5043PorBon3, P02OU5_n5043PorBon3
            }
            , new Object[] {
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

   private byte AV15Modif ;
   private short AV9RecTipCon ;
   private short AV13Limite3 ;
   private short A2935Limite3 ;
   private short A2933RecTipCon ;
   private short Gx_err ;
   private int AV8CliCod ;
   private int A252CliCod ;
   private int AV10CliCodTar ;
   private int GX_INS431 ;
   private int GX_INS432 ;
   private java.math.BigDecimal A2936Precio3 ;
   private java.math.BigDecimal A5043PorBon3 ;
   private java.math.BigDecimal AV11Precio3 ;
   private java.math.BigDecimal AV14PorBon3 ;
   private String A396EmprCod ;
   private String AV12Opcion ;
   private String scmdbuf ;
   private String A2934RecTipDsc ;
   private String AV16RecTipDsc ;
   private String AV17Texto ;
   private String Gx_emsg ;
   private boolean n2934RecTipDsc ;
   private boolean n2936Precio3 ;
   private boolean n5043PorBon3 ;
   private boolean returnInSub ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private short[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02OU2_A396EmprCod ;
   private short[] P02OU2_A2935Limite3 ;
   private short[] P02OU2_A2933RecTipCon ;
   private int[] P02OU2_A252CliCod ;
   private String[] P02OU2_A2934RecTipDsc ;
   private boolean[] P02OU2_n2934RecTipDsc ;
   private java.math.BigDecimal[] P02OU2_A2936Precio3 ;
   private boolean[] P02OU2_n2936Precio3 ;
   private java.math.BigDecimal[] P02OU2_A5043PorBon3 ;
   private boolean[] P02OU2_n5043PorBon3 ;
   private String[] P02OU3_A396EmprCod ;
   private int[] P02OU3_A252CliCod ;
   private String[] P02OU5_A396EmprCod ;
   private short[] P02OU5_A2935Limite3 ;
   private short[] P02OU5_A2933RecTipCon ;
   private int[] P02OU5_A252CliCod ;
   private java.math.BigDecimal[] P02OU5_A2936Precio3 ;
   private boolean[] P02OU5_n2936Precio3 ;
   private java.math.BigDecimal[] P02OU5_A5043PorBon3 ;
   private boolean[] P02OU5_n5043PorBon3 ;
}

final  class ptaruni__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02OU2", "SELECT T1.EmprCod, T1.Limite3, T1.RecTipCon, T1.CliCod, T2.RecTipDsc, T1.Precio3, T1.PorBon3 FROM (TXPLRECON T1 INNER JOIN TXPCRECON T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.RecTipCon = T1.RecTipCon) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.RecTipCon = ? and T1.Limite3 = ? ORDER BY T1.EmprCod, T1.CliCod, T1.RecTipCon, T1.Limite3 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02OU3", "SELECT EmprCod, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliCod <> 9 and CliCod <> ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02OU4", "DELETE FROM TXPLRECON  WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECON")
         ,new ForEachCursor("P02OU5", "SELECT EmprCod, Limite3, RecTipCon, CliCod, Precio3, PorBon3 FROM TXPLRECON WHERE EmprCod = ? and CliCod = ? and RecTipCon = ? and Limite3 = ? ORDER BY EmprCod, CliCod, RecTipCon, Limite3 ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02OU6", "UPDATE TXPLRECON SET Precio3=?, PorBon3=?  WHERE EmprCod = ? AND CliCod = ? AND RecTipCon = ? AND Limite3 = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECON")
         ,new UpdateCursor("P02OU7", "INSERT INTO TXPCRECON(EmprCod, CliCod, RecTipCon, RecTipDsc) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCRECON")
         ,new UpdateCursor("P02OU8", "INSERT INTO TXPLRECON(EmprCod, CliCod, RecTipCon, Limite3, Precio3, PorBon3) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLRECON")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 35);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
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
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 35);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
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
      }
   }

}

