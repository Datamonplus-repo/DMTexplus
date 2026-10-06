package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcreoemp extends GXProcedure
{
   public pcreoemp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcreoemp.class ), "" );
   }

   public pcreoemp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          java.math.BigDecimal[] aP2 )
   {
      pcreoemp.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             int[] aP3 )
   {
      pcreoemp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcreoemp.this.A361DisCod = aP1[0];
      this.aP1 = aP1;
      pcreoemp.this.AV20Metros = aP2[0];
      this.aP2 = aP2;
      pcreoemp.this.AV19Piezas = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = AV24Pgmdesc + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Dispos : ", "") + GXutil.trim( GXutil.str( A361DisCod, 10, 0)) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Metros : ", "") + GXutil.trim( GXutil.str( AV20Metros, 10, 0)) + GXutil.newLine( ) ;
      Gx_msg += httpContext.getMessage( "Piezas : ", "") + GXutil.trim( GXutil.str( AV19Piezas, 10, 0)) ;
      System.out.println( httpContext.getMessage( "Go PCREOEMP", "") );
      /* Using cursor P018W2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A966PartCod = P018W2_A966PartCod[0] ;
         n966PartCod = P018W2_n966PartCod[0] ;
         A335DisArtCod = P018W2_A335DisArtCod[0] ;
         A362DisColNom = P018W2_A362DisColNom[0] ;
         n362DisColNom = P018W2_n362DisColNom[0] ;
         A970ProceCod = P018W2_A970ProceCod[0] ;
         n970ProceCod = P018W2_n970ProceCod[0] ;
         A252CliCod = P018W2_A252CliCod[0] ;
         A970ProceCod = P018W2_A970ProceCod[0] ;
         n970ProceCod = P018W2_n970ProceCod[0] ;
         AV16FonCod = GXutil.substring( A362DisColNom, 1, 12) ;
         AV17EmpesCod = A335DisArtCod ;
         AV18CliCod = A252CliCod ;
         /*
            INSERT RECORD ON TABLE TXPCEMPES

         */
         W1031EmpesCod = A1031EmpesCod ;
         A1031EmpesCod = A335DisArtCod ;
         A1032FonCod = GXutil.substring( A362DisColNom, 1, 12) ;
         A1033EmpesFec = GXutil.today( ) ;
         n1033EmpesFec = false ;
         A1041EmpesULin = 0 ;
         n1041EmpesULin = false ;
         A2094EmpOpeULi = (short)(0) ;
         n2094EmpOpeULi = false ;
         AV15Num_Linea = (short)(0) ;
         /* Using cursor P018W3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1033EmpesFec), A1033EmpesFec, Boolean.valueOf(n1041EmpesULin), Integer.valueOf(A1041EmpesULin), Boolean.valueOf(n2094EmpOpeULi), Short.valueOf(A2094EmpOpeULi)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEMPES");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            /* Using cursor P018W4 */
            pr_default.execute(2, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A396EmprCod = P018W4_A396EmprCod[0] ;
               A1031EmpesCod = P018W4_A1031EmpesCod[0] ;
               A252CliCod = P018W4_A252CliCod[0] ;
               A1032FonCod = P018W4_A1032FonCod[0] ;
               A1041EmpesULin = P018W4_A1041EmpesULin[0] ;
               n1041EmpesULin = P018W4_n1041EmpesULin[0] ;
               AV15Num_Linea = (short)(A1041EmpesULin) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(2);
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A1031EmpesCod = W1031EmpesCod ;
         /* End Insert */
         System.out.println( httpContext.getMessage( "End New CEMPES", "") );
         /*
            INSERT RECORD ON TABLE TXPLEMPES

         */
         W1031EmpesCod = A1031EmpesCod ;
         W252CliCod = A252CliCod ;
         A1031EmpesCod = A335DisArtCod ;
         A252CliCod = AV18CliCod ;
         A1032FonCod = GXutil.substring( A362DisColNom, 1, 12) ;
         A1042EmpesLin = (int)(AV15Num_Linea+1) ;
         A1043EmpesLTip = httpContext.getMessage( "E", "") ;
         n1043EmpesLTip = false ;
         A1044EmpesAlbDi = A361DisCod ;
         n1044EmpesAlbDi = false ;
         A1045EmpesSitDi = httpContext.getMessage( "Recepcion de Tinte", "") ;
         n1045EmpesSitDi = false ;
         A1046EmpesFecM = GXutil.today( ) ;
         n1046EmpesFecM = false ;
         A1047EmpesUEntL = AV20Metros ;
         n1047EmpesUEntL = false ;
         A1048EmpesUUtiL = DecimalUtil.doubleToDec(0) ;
         n1048EmpesUUtiL = false ;
         A1049EmpesPEntL = (short)(AV19Piezas) ;
         n1049EmpesPEntL = false ;
         A1050EmpesPUtiL = (short)(0) ;
         n1050EmpesPUtiL = false ;
         /* Using cursor P018W5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A1031EmpesCod, Integer.valueOf(A252CliCod), A1032FonCod, Integer.valueOf(A1042EmpesLin), Boolean.valueOf(n1043EmpesLTip), A1043EmpesLTip, Boolean.valueOf(n1044EmpesAlbDi), Integer.valueOf(A1044EmpesAlbDi), Boolean.valueOf(n1045EmpesSitDi), A1045EmpesSitDi, Boolean.valueOf(n1046EmpesFecM), A1046EmpesFecM, Boolean.valueOf(n1047EmpesUEntL), A1047EmpesUEntL, Boolean.valueOf(n1048EmpesUUtiL), A1048EmpesUUtiL, Boolean.valueOf(n1049EmpesPEntL), Short.valueOf(A1049EmpesPEntL), Boolean.valueOf(n1050EmpesPUtiL), Short.valueOf(A1050EmpesPUtiL)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLEMPES");
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
         A1031EmpesCod = W1031EmpesCod ;
         A252CliCod = W252CliCod ;
         /* End Insert */
         System.out.println( httpContext.getMessage( "End New LEMPES", "") );
         AV15Num_Linea = (short)(AV15Num_Linea+1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      n1041EmpesULin = false ;
      /* Optimized UPDATE. */
      /* Using cursor P018W6 */
      int AV15Num_Linea1041Aux;
      AV15Num_Linea1041Aux = AV15Num_Linea ;
      pr_default.execute(4, new Object[] {Boolean.valueOf(n1041EmpesULin), Integer.valueOf(AV15Num_Linea1041Aux), A396EmprCod, AV17EmpesCod, Integer.valueOf(AV18CliCod), AV16FonCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEMPES");
      /* End optimized UPDATE. */
      System.out.println( httpContext.getMessage( "End PCREOEMP", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcreoemp.this.A396EmprCod;
      this.aP1[0] = pcreoemp.this.A361DisCod;
      this.aP2[0] = pcreoemp.this.AV20Metros;
      this.aP3[0] = pcreoemp.this.AV19Piezas;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcreoemp");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      AV24Pgmdesc = "" ;
      scmdbuf = "" ;
      P018W2_A966PartCod = new String[] {""} ;
      P018W2_n966PartCod = new boolean[] {false} ;
      P018W2_A396EmprCod = new String[] {""} ;
      P018W2_A361DisCod = new int[1] ;
      P018W2_A335DisArtCod = new String[] {""} ;
      P018W2_A362DisColNom = new String[] {""} ;
      P018W2_n362DisColNom = new boolean[] {false} ;
      P018W2_A970ProceCod = new short[1] ;
      P018W2_n970ProceCod = new boolean[] {false} ;
      P018W2_A252CliCod = new int[1] ;
      A966PartCod = "" ;
      A335DisArtCod = "" ;
      A362DisColNom = "" ;
      AV16FonCod = "" ;
      AV17EmpesCod = "" ;
      W1031EmpesCod = "" ;
      A1031EmpesCod = "" ;
      A1032FonCod = "" ;
      A1033EmpesFec = GXutil.nullDate() ;
      Gx_emsg = "" ;
      P018W4_A396EmprCod = new String[] {""} ;
      P018W4_A1031EmpesCod = new String[] {""} ;
      P018W4_A252CliCod = new int[1] ;
      P018W4_A1032FonCod = new String[] {""} ;
      P018W4_A1041EmpesULin = new int[1] ;
      P018W4_n1041EmpesULin = new boolean[] {false} ;
      A1043EmpesLTip = "" ;
      A1045EmpesSitDi = "" ;
      A1046EmpesFecM = GXutil.nullDate() ;
      A1047EmpesUEntL = DecimalUtil.ZERO ;
      A1048EmpesUUtiL = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcreoemp__default(),
         new Object[] {
             new Object[] {
            P018W2_A966PartCod, P018W2_n966PartCod, P018W2_A396EmprCod, P018W2_A361DisCod, P018W2_A335DisArtCod, P018W2_A362DisColNom, P018W2_n362DisColNom, P018W2_A970ProceCod, P018W2_n970ProceCod, P018W2_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P018W4_A396EmprCod, P018W4_A1031EmpesCod, P018W4_A252CliCod, P018W4_A1032FonCod, P018W4_A1041EmpesULin, P018W4_n1041EmpesULin
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      AV24Pgmdesc = httpContext.getMessage( "CREO EMPESA DESDE TINTE", "") ;
      /* GeneXus formulas. */
      AV24Pgmdesc = httpContext.getMessage( "CREO EMPESA DESDE TINTE", "") ;
      Gx_err = (short)(0) ;
   }

   private short A970ProceCod ;
   private short A2094EmpOpeULi ;
   private short AV15Num_Linea ;
   private short Gx_err ;
   private short A1049EmpesPEntL ;
   private short A1050EmpesPUtiL ;
   private int A361DisCod ;
   private int AV19Piezas ;
   private int A252CliCod ;
   private int AV18CliCod ;
   private int GX_INS552 ;
   private int A1041EmpesULin ;
   private int GX_INS553 ;
   private int W252CliCod ;
   private int A1042EmpesLin ;
   private int A1044EmpesAlbDi ;
   private java.math.BigDecimal AV20Metros ;
   private java.math.BigDecimal A1047EmpesUEntL ;
   private java.math.BigDecimal A1048EmpesUUtiL ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String AV24Pgmdesc ;
   private String scmdbuf ;
   private String A966PartCod ;
   private String A335DisArtCod ;
   private String A362DisColNom ;
   private String AV16FonCod ;
   private String AV17EmpesCod ;
   private String W1031EmpesCod ;
   private String A1031EmpesCod ;
   private String A1032FonCod ;
   private String Gx_emsg ;
   private String A1043EmpesLTip ;
   private String A1045EmpesSitDi ;
   private java.util.Date A1033EmpesFec ;
   private java.util.Date A1046EmpesFecM ;
   private boolean n966PartCod ;
   private boolean n362DisColNom ;
   private boolean n970ProceCod ;
   private boolean n1033EmpesFec ;
   private boolean n1041EmpesULin ;
   private boolean n2094EmpOpeULi ;
   private boolean n1043EmpesLTip ;
   private boolean n1044EmpesAlbDi ;
   private boolean n1045EmpesSitDi ;
   private boolean n1046EmpesFecM ;
   private boolean n1047EmpesUEntL ;
   private boolean n1048EmpesUUtiL ;
   private boolean n1049EmpesPEntL ;
   private boolean n1050EmpesPUtiL ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P018W2_A966PartCod ;
   private boolean[] P018W2_n966PartCod ;
   private String[] P018W2_A396EmprCod ;
   private int[] P018W2_A361DisCod ;
   private String[] P018W2_A335DisArtCod ;
   private String[] P018W2_A362DisColNom ;
   private boolean[] P018W2_n362DisColNom ;
   private short[] P018W2_A970ProceCod ;
   private boolean[] P018W2_n970ProceCod ;
   private int[] P018W2_A252CliCod ;
   private String[] P018W4_A396EmprCod ;
   private String[] P018W4_A1031EmpesCod ;
   private int[] P018W4_A252CliCod ;
   private String[] P018W4_A1032FonCod ;
   private int[] P018W4_A1041EmpesULin ;
   private boolean[] P018W4_n1041EmpesULin ;
}

final  class pcreoemp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P018W2", "SELECT T1.PartCod, T1.EmprCod, T1.DisCod, T1.DisArtCod, T1.DisColNom, T2.ProceCod, T1.CliCod FROM (TXPDISPOS T1 LEFT JOIN TXPCPARTI T2 ON T2.EmprCod = T1.EmprCod AND T2.PartCod = T1.PartCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.DisCod = ? ORDER BY T1.EmprCod, T1.DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018W3", "INSERT INTO TXPCEMPES(EmprCod, EmpesCod, CliCod, FonCod, ProceCod, EmpesFec, EmpesULin, EmpOpeULi) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEMPES")
         ,new ForEachCursor("P018W4", "SELECT EmprCod, EmpesCod, CliCod, FonCod, EmpesULin FROM TXPCEMPES WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ? ORDER BY EmprCod, EmpesCod, CliCod, FonCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P018W5", "INSERT INTO TXPLEMPES(EmprCod, EmpesCod, CliCod, FonCod, EmpesLin, EmpesLTip, EmpesAlbDi, EmpesSitDi, EmpesFecM, EmpesUEntL, EmpesUUtiL, EmpesPEntL, EmpesPUtiL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLEMPES")
         ,new UpdateCursor("P018W6", "UPDATE TXPCEMPES SET EmpesULin=?  WHERE EmprCod = ? and EmpesCod = ? and CliCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCEMPES")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 12);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[20]).shortValue());
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 12);
               return;
      }
   }

}

