package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pimpop extends GXProcedure
{
   public pimpop( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pimpop.class ), "" );
   }

   public pimpop( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pimpop.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pimpop.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pimpop.this.AV8Tex_nped = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Optimized DELETE. */
      /* Using cursor P031F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8Tex_nped)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIMPOP");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "pimpop");
      /* Using cursor P031F3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8Tex_nped)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A6857Tex_Lin = P031F3_A6857Tex_Lin[0] ;
         A6850Tex_NPed = P031F3_A6850Tex_NPed[0] ;
         A6994Tex_Talla = P031F3_A6994Tex_Talla[0] ;
         n6994Tex_Talla = P031F3_n6994Tex_Talla[0] ;
         A7830Tex_imp = P031F3_A7830Tex_imp[0] ;
         n7830Tex_imp = P031F3_n7830Tex_imp[0] ;
         if ( GXutil.strcmp(A6994Tex_Talla, httpContext.getMessage( "S", "")) == 0 )
         {
            W396EmprCod = A396EmprCod ;
            /* Using cursor P031F4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A6996Tex_Ntalla = P031F4_A6996Tex_Ntalla[0] ;
               A6858Tex_Kgs = P031F4_A6858Tex_Kgs[0] ;
               n6858Tex_Kgs = P031F4_n6858Tex_Kgs[0] ;
               A6859Tex_artc = P031F4_A6859Tex_artc[0] ;
               n6859Tex_artc = P031F4_n6859Tex_artc[0] ;
               A6861Tex_NomCol = P031F4_A6861Tex_NomCol[0] ;
               n6861Tex_NomCol = P031F4_n6861Tex_NomCol[0] ;
               A6862Tex_NumCol = P031F4_A6862Tex_NumCol[0] ;
               n6862Tex_NumCol = P031F4_n6862Tex_NumCol[0] ;
               A6863Tex_TcCol = P031F4_A6863Tex_TcCol[0] ;
               n6863Tex_TcCol = P031F4_n6863Tex_TcCol[0] ;
               A6997Tex_Unid = P031F4_A6997Tex_Unid[0] ;
               n6997Tex_Unid = P031F4_n6997Tex_Unid[0] ;
               A6998Tex_AnchoA = P031F4_A6998Tex_AnchoA[0] ;
               n6998Tex_AnchoA = P031F4_n6998Tex_AnchoA[0] ;
               A6999tex_Altura = P031F4_A6999tex_Altura[0] ;
               n6999tex_Altura = P031F4_n6999tex_Altura[0] ;
               A6858Tex_Kgs = P031F4_A6858Tex_Kgs[0] ;
               n6858Tex_Kgs = P031F4_n6858Tex_Kgs[0] ;
               A6859Tex_artc = P031F4_A6859Tex_artc[0] ;
               n6859Tex_artc = P031F4_n6859Tex_artc[0] ;
               A6861Tex_NomCol = P031F4_A6861Tex_NomCol[0] ;
               n6861Tex_NomCol = P031F4_n6861Tex_NomCol[0] ;
               A6862Tex_NumCol = P031F4_A6862Tex_NumCol[0] ;
               n6862Tex_NumCol = P031F4_n6862Tex_NumCol[0] ;
               A6863Tex_TcCol = P031F4_A6863Tex_TcCol[0] ;
               n6863Tex_TcCol = P031F4_n6863Tex_TcCol[0] ;
               W396EmprCod = A396EmprCod ;
               /*
                  INSERT RECORD ON TABLE TXPIMPOP

               */
               W396EmprCod = A396EmprCod ;
               A7831Aux_NPED = A6850Tex_NPed ;
               A7832Aux_LIN = A6857Tex_Lin ;
               A7838Aux_TALLA = A6996Tex_Ntalla ;
               A7833Aux_KGS = A6858Tex_Kgs ;
               n7833Aux_KGS = false ;
               A7834Aux_ARTC = A6859Tex_artc ;
               n7834Aux_ARTC = false ;
               A7835Aux_NOMC = A6861Tex_NomCol ;
               n7835Aux_NOMC = false ;
               A7836Aux_NUMC = A6862Tex_NumCol ;
               n7836Aux_NUMC = false ;
               A7837Aux_TC = A6863Tex_TcCol ;
               n7837Aux_TC = false ;
               A7839Aux_UNID = A6997Tex_Unid ;
               n7839Aux_UNID = false ;
               A7840Aux_ANC = A6998Tex_AnchoA ;
               n7840Aux_ANC = false ;
               A7841Aux_ALT = A6999tex_Altura ;
               n7841Aux_ALT = false ;
               /* Using cursor P031F5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7831Aux_NPED), Short.valueOf(A7832Aux_LIN), A7838Aux_TALLA, Boolean.valueOf(n7834Aux_ARTC), A7834Aux_ARTC, Boolean.valueOf(n7833Aux_KGS), A7833Aux_KGS, Boolean.valueOf(n7835Aux_NOMC), A7835Aux_NOMC, Boolean.valueOf(n7836Aux_NUMC), Integer.valueOf(A7836Aux_NUMC), Boolean.valueOf(n7837Aux_TC), Byte.valueOf(A7837Aux_TC), Boolean.valueOf(n7839Aux_UNID), Integer.valueOf(A7839Aux_UNID), Boolean.valueOf(n7840Aux_ANC), A7840Aux_ANC, Boolean.valueOf(n7841Aux_ALT), A7841Aux_ALT});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPIMPOP");
               if ( (pr_default.getStatus(3) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            A7830Tex_imp = httpContext.getMessage( "N", "") ;
            n7830Tex_imp = false ;
            /* Using cursor P031F6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n7830Tex_imp), A7830Tex_imp, A396EmprCod, Integer.valueOf(A6850Tex_NPed), Short.valueOf(A6857Tex_Lin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTEX001");
            A396EmprCod = W396EmprCod ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pimpop.this.A396EmprCod;
      this.aP1[0] = pimpop.this.AV8Tex_nped;
      Application.commitDataStores(context, remoteHandle, pr_default, "pimpop");
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
      P031F3_A396EmprCod = new String[] {""} ;
      P031F3_A6857Tex_Lin = new short[1] ;
      P031F3_A6850Tex_NPed = new int[1] ;
      P031F3_A6994Tex_Talla = new String[] {""} ;
      P031F3_n6994Tex_Talla = new boolean[] {false} ;
      P031F3_A7830Tex_imp = new String[] {""} ;
      P031F3_n7830Tex_imp = new boolean[] {false} ;
      A6994Tex_Talla = "" ;
      A7830Tex_imp = "" ;
      W396EmprCod = "" ;
      P031F4_A396EmprCod = new String[] {""} ;
      P031F4_A6850Tex_NPed = new int[1] ;
      P031F4_A6857Tex_Lin = new short[1] ;
      P031F4_A6996Tex_Ntalla = new String[] {""} ;
      P031F4_A6858Tex_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P031F4_n6858Tex_Kgs = new boolean[] {false} ;
      P031F4_A6859Tex_artc = new String[] {""} ;
      P031F4_n6859Tex_artc = new boolean[] {false} ;
      P031F4_A6861Tex_NomCol = new String[] {""} ;
      P031F4_n6861Tex_NomCol = new boolean[] {false} ;
      P031F4_A6862Tex_NumCol = new int[1] ;
      P031F4_n6862Tex_NumCol = new boolean[] {false} ;
      P031F4_A6863Tex_TcCol = new byte[1] ;
      P031F4_n6863Tex_TcCol = new boolean[] {false} ;
      P031F4_A6997Tex_Unid = new int[1] ;
      P031F4_n6997Tex_Unid = new boolean[] {false} ;
      P031F4_A6998Tex_AnchoA = new String[] {""} ;
      P031F4_n6998Tex_AnchoA = new boolean[] {false} ;
      P031F4_A6999tex_Altura = new String[] {""} ;
      P031F4_n6999tex_Altura = new boolean[] {false} ;
      A6996Tex_Ntalla = "" ;
      A6858Tex_Kgs = DecimalUtil.ZERO ;
      A6859Tex_artc = "" ;
      A6861Tex_NomCol = "" ;
      A6998Tex_AnchoA = "" ;
      A6999tex_Altura = "" ;
      A7838Aux_TALLA = "" ;
      A7833Aux_KGS = DecimalUtil.ZERO ;
      A7834Aux_ARTC = "" ;
      A7835Aux_NOMC = "" ;
      A7840Aux_ANC = "" ;
      A7841Aux_ALT = "" ;
      Gx_emsg = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pimpop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pimpop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pimpop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pimpop__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P031F3_A396EmprCod, P031F3_A6857Tex_Lin, P031F3_A6850Tex_NPed, P031F3_A6994Tex_Talla, P031F3_n6994Tex_Talla, P031F3_A7830Tex_imp, P031F3_n7830Tex_imp
            }
            , new Object[] {
            P031F4_A396EmprCod, P031F4_A6850Tex_NPed, P031F4_A6857Tex_Lin, P031F4_A6996Tex_Ntalla, P031F4_A6858Tex_Kgs, P031F4_n6858Tex_Kgs, P031F4_A6859Tex_artc, P031F4_n6859Tex_artc, P031F4_A6861Tex_NomCol, P031F4_n6861Tex_NomCol,
            P031F4_A6862Tex_NumCol, P031F4_n6862Tex_NumCol, P031F4_A6863Tex_TcCol, P031F4_n6863Tex_TcCol, P031F4_A6997Tex_Unid, P031F4_n6997Tex_Unid, P031F4_A6998Tex_AnchoA, P031F4_n6998Tex_AnchoA, P031F4_A6999tex_Altura, P031F4_n6999tex_Altura
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

   private byte A6863Tex_TcCol ;
   private byte A7837Aux_TC ;
   private short A6857Tex_Lin ;
   private short A7832Aux_LIN ;
   private short Gx_err ;
   private int AV8Tex_nped ;
   private int A6850Tex_NPed ;
   private int A6862Tex_NumCol ;
   private int A6997Tex_Unid ;
   private int GX_INS1096 ;
   private int A7831Aux_NPED ;
   private int A7836Aux_NUMC ;
   private int A7839Aux_UNID ;
   private java.math.BigDecimal A6858Tex_Kgs ;
   private java.math.BigDecimal A7833Aux_KGS ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A6994Tex_Talla ;
   private String A7830Tex_imp ;
   private String W396EmprCod ;
   private String A6996Tex_Ntalla ;
   private String A6859Tex_artc ;
   private String A6861Tex_NomCol ;
   private String A6998Tex_AnchoA ;
   private String A6999tex_Altura ;
   private String A7838Aux_TALLA ;
   private String A7834Aux_ARTC ;
   private String A7835Aux_NOMC ;
   private String A7840Aux_ANC ;
   private String A7841Aux_ALT ;
   private String Gx_emsg ;
   private boolean n6994Tex_Talla ;
   private boolean n7830Tex_imp ;
   private boolean n6858Tex_Kgs ;
   private boolean n6859Tex_artc ;
   private boolean n6861Tex_NomCol ;
   private boolean n6862Tex_NumCol ;
   private boolean n6863Tex_TcCol ;
   private boolean n6997Tex_Unid ;
   private boolean n6998Tex_AnchoA ;
   private boolean n6999tex_Altura ;
   private boolean n7833Aux_KGS ;
   private boolean n7834Aux_ARTC ;
   private boolean n7835Aux_NOMC ;
   private boolean n7836Aux_NUMC ;
   private boolean n7837Aux_TC ;
   private boolean n7839Aux_UNID ;
   private boolean n7840Aux_ANC ;
   private boolean n7841Aux_ALT ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P031F3_A396EmprCod ;
   private short[] P031F3_A6857Tex_Lin ;
   private int[] P031F3_A6850Tex_NPed ;
   private String[] P031F3_A6994Tex_Talla ;
   private boolean[] P031F3_n6994Tex_Talla ;
   private String[] P031F3_A7830Tex_imp ;
   private boolean[] P031F3_n7830Tex_imp ;
   private String[] P031F4_A396EmprCod ;
   private int[] P031F4_A6850Tex_NPed ;
   private short[] P031F4_A6857Tex_Lin ;
   private String[] P031F4_A6996Tex_Ntalla ;
   private java.math.BigDecimal[] P031F4_A6858Tex_Kgs ;
   private boolean[] P031F4_n6858Tex_Kgs ;
   private String[] P031F4_A6859Tex_artc ;
   private boolean[] P031F4_n6859Tex_artc ;
   private String[] P031F4_A6861Tex_NomCol ;
   private boolean[] P031F4_n6861Tex_NomCol ;
   private int[] P031F4_A6862Tex_NumCol ;
   private boolean[] P031F4_n6862Tex_NumCol ;
   private byte[] P031F4_A6863Tex_TcCol ;
   private boolean[] P031F4_n6863Tex_TcCol ;
   private int[] P031F4_A6997Tex_Unid ;
   private boolean[] P031F4_n6997Tex_Unid ;
   private String[] P031F4_A6998Tex_AnchoA ;
   private boolean[] P031F4_n6998Tex_AnchoA ;
   private String[] P031F4_A6999tex_Altura ;
   private boolean[] P031F4_n6999tex_Altura ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pimpop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pimpop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pimpop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pimpop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P031F2", "DELETE FROM TXPIMPOP  WHERE EmprCod = ? and Aux_NPED = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPIMPOP")
         ,new ForEachCursor("P031F3", "SELECT EmprCod, Tex_Lin, Tex_NPed, Tex_Talla, Tex_imp FROM TXPTEX001 WHERE EmprCod = ? and Tex_NPed = ? ORDER BY EmprCod, Tex_NPed, Tex_Lin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P031F4", "SELECT T1.EmprCod, T1.Tex_NPed, T1.Tex_Lin, T1.Tex_Ntalla, T2.Tex_Kgs, T2.Tex_artc, T2.Tex_NomCol, T2.Tex_NumCol, T2.Tex_TcCol, T1.Tex_Unid, T1.Tex_AnchoA, T1.tex_Altura FROM (TXPTEX002 T1 INNER JOIN TXPTEX001 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tex_NPed = T1.Tex_NPed AND T2.Tex_Lin = T1.Tex_Lin) WHERE T1.EmprCod = ? and T1.Tex_NPed = ? and T1.Tex_Lin = ? ORDER BY T1.EmprCod, T1.Tex_NPed, T1.Tex_Lin, T1.Tex_Ntalla ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P031F5", "INSERT INTO TXPIMPOP(EmprCod, Aux_NPED, Aux_LIN, Aux_TALLA, Aux_ARTC, Aux_KGS, Aux_NOMC, Aux_NUMC, Aux_TC, Aux_UNID, Aux_ANC, Aux_ALT) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPIMPOP")
         ,new UpdateCursor("P031F6", "UPDATE TXPTEX001 SET Tex_imp=?  WHERE EmprCod = ? AND Tex_NPed = ? AND Tex_Lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPTEX001")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 4);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 16);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 13);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[11]).intValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 10);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

