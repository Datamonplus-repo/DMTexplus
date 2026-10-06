package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pubiact extends GXProcedure
{
   public pubiact( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pubiact.class ), "" );
   }

   public pubiact( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      pubiact.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        byte[] aP6 ,
                        String[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        short[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        short[] aP11 ,
                        short[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             byte[] aP6 ,
                             String[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             short[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             short[] aP11 ,
                             short[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      pubiact.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pubiact.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pubiact.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pubiact.this.AV11Albaran = aP3[0];
      this.aP3 = aP3;
      pubiact.this.AV15Fecha = aP4[0];
      this.aP4 = aP4;
      pubiact.this.AV14Ok_Tint = aP5[0];
      this.aP5 = aP5;
      pubiact.this.AV10Tipo = aP6[0];
      this.aP6 = aP6;
      pubiact.this.AV9UbiCod = aP7[0];
      this.aP7 = aP7;
      pubiact.this.AV12UbiKilEnt = aP8[0];
      this.aP8 = aP8;
      pubiact.this.AV13UbiConEnt = aP9[0];
      this.aP9 = aP9;
      pubiact.this.AV17UbiKilUti = aP10[0];
      this.aP10 = aP10;
      pubiact.this.AV18UbiConUti = aP11[0];
      this.aP11 = aP11;
      pubiact.this.AV19ManCod = aP12[0];
      this.aP12 = aP12;
      pubiact.this.AV20FasCod = aP13[0];
      this.aP13 = aP13;
      pubiact.this.AV16UbiObs = aP14[0];
      this.aP14 = aP14;
      pubiact.this.AV23Opcion = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ( GXutil.strcmp(AV23Opcion, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV23Opcion, httpContext.getMessage( "B", "")) == 0 ) )
      {
         /* Using cursor P020G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A966PartCod, AV9UbiCod, Integer.valueOf(AV11Albaran)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5834UbiAlbHdr = P020G2_A5834UbiAlbHdr[0] ;
            n5834UbiAlbHdr = P020G2_n5834UbiAlbHdr[0] ;
            A5850UbiTip = P020G2_A5850UbiTip[0] ;
            n5850UbiTip = P020G2_n5850UbiTip[0] ;
            A5838UbiCod = P020G2_A5838UbiCod[0] ;
            n5838UbiCod = P020G2_n5838UbiCod[0] ;
            A5849UbiLin = P020G2_A5849UbiLin[0] ;
            if ( GXutil.strcmp(A5850UbiTip, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Using cursor P020G3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Short.valueOf(A5849UbiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIMTO");
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      if ( ( GXutil.strcmp(AV23Opcion, httpContext.getMessage( "A", "")) == 0 ) || ( GXutil.strcmp(AV23Opcion, httpContext.getMessage( "M", "")) == 0 ) )
      {
         /* Using cursor P020G4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A5848ParUbiLin = P020G4_A5848ParUbiLin[0] ;
            n5848ParUbiLin = P020G4_n5848ParUbiLin[0] ;
            AV8UbiLin = (short)(A5848ParUbiLin+1) ;
            if ( AV8UbiLin > 9998 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. NO SE PUEDEN GENERAR MAS LINEAS DE UBICACION PARA EL PARTIDO ACTUAL", ""));
            }
            else
            {
               A5848ParUbiLin = AV8UbiLin ;
               n5848ParUbiLin = false ;
               /*
                  INSERT RECORD ON TABLE TXPUBIMTO

               */
               A5849UbiLin = AV8UbiLin ;
               A5838UbiCod = AV9UbiCod ;
               n5838UbiCod = false ;
               if ( AV10Tipo == 1 )
               {
                  A5850UbiTip = httpContext.getMessage( "E", "") ;
                  n5850UbiTip = false ;
               }
               else if ( AV10Tipo == 2 )
               {
                  A5850UbiTip = httpContext.getMessage( "S", "") ;
                  n5850UbiTip = false ;
               }
               else if ( AV10Tipo == 3 )
               {
                  A5850UbiTip = httpContext.getMessage( "MS", "") ;
                  n5850UbiTip = false ;
               }
               else if ( AV10Tipo == 4 )
               {
                  A5850UbiTip = httpContext.getMessage( "ME", "") ;
                  n5850UbiTip = false ;
               }
               A5834UbiAlbHdr = AV11Albaran ;
               n5834UbiAlbHdr = false ;
               A5851UbiFecMov = AV15Fecha ;
               n5851UbiFecMov = false ;
               A5852UbiKilEnt = AV12UbiKilEnt ;
               n5852UbiKilEnt = false ;
               A5853UbiConEnt = AV13UbiConEnt ;
               n5853UbiConEnt = false ;
               A5854UbiKilUti = AV17UbiKilUti ;
               n5854UbiKilUti = false ;
               A5855UbiConUti = AV18UbiConUti ;
               n5855UbiConUti = false ;
               A2248ManCod = AV19ManCod ;
               n2248ManCod = false ;
               A457FasCod = AV20FasCod ;
               n457FasCod = false ;
               A5857UbiOkTi = AV14Ok_Tint ;
               n5857UbiOkTi = false ;
               A5856UbiObs = AV16UbiObs ;
               n5856UbiObs = false ;
               if ( ( AV10Tipo == 1 ) || ( AV10Tipo == 4 ) )
               {
                  A5898UbiCie = httpContext.getMessage( "N", "") ;
                  n5898UbiCie = false ;
               }
               else
               {
                  A5898UbiCie = " " ;
                  n5898UbiCie = false ;
               }
               /* Using cursor P020G5 */
               pr_default.execute(3, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Short.valueOf(A5849UbiLin), Boolean.valueOf(n5838UbiCod), A5838UbiCod, Boolean.valueOf(n5850UbiTip), A5850UbiTip, Boolean.valueOf(n5834UbiAlbHdr), Integer.valueOf(A5834UbiAlbHdr), Boolean.valueOf(n5851UbiFecMov), A5851UbiFecMov, Boolean.valueOf(n5852UbiKilEnt), A5852UbiKilEnt, Boolean.valueOf(n5853UbiConEnt), Short.valueOf(A5853UbiConEnt), Boolean.valueOf(n5854UbiKilUti), A5854UbiKilUti, Boolean.valueOf(n5855UbiConUti), Short.valueOf(A5855UbiConUti), Boolean.valueOf(n2248ManCod), Short.valueOf(A2248ManCod), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n5856UbiObs), A5856UbiObs, Boolean.valueOf(n5857UbiOkTi), A5857UbiOkTi, Boolean.valueOf(n5898UbiCie), A5898UbiCie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIMTO");
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
               /* End Insert */
            }
            /* Using cursor P020G6 */
            pr_default.execute(4, new Object[] {Boolean.valueOf(n5848ParUbiLin), Short.valueOf(A5848ParUbiLin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pubiact.this.A396EmprCod;
      this.aP1[0] = pubiact.this.A966PartCod;
      this.aP2[0] = pubiact.this.A252CliCod;
      this.aP3[0] = pubiact.this.AV11Albaran;
      this.aP4[0] = pubiact.this.AV15Fecha;
      this.aP5[0] = pubiact.this.AV14Ok_Tint;
      this.aP6[0] = pubiact.this.AV10Tipo;
      this.aP7[0] = pubiact.this.AV9UbiCod;
      this.aP8[0] = pubiact.this.AV12UbiKilEnt;
      this.aP9[0] = pubiact.this.AV13UbiConEnt;
      this.aP10[0] = pubiact.this.AV17UbiKilUti;
      this.aP11[0] = pubiact.this.AV18UbiConUti;
      this.aP12[0] = pubiact.this.AV19ManCod;
      this.aP13[0] = pubiact.this.AV20FasCod;
      this.aP14[0] = pubiact.this.AV16UbiObs;
      this.aP15[0] = pubiact.this.AV23Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pubiact");
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
      P020G2_A396EmprCod = new String[] {""} ;
      P020G2_A966PartCod = new String[] {""} ;
      P020G2_A252CliCod = new int[1] ;
      P020G2_A5834UbiAlbHdr = new int[1] ;
      P020G2_n5834UbiAlbHdr = new boolean[] {false} ;
      P020G2_A5850UbiTip = new String[] {""} ;
      P020G2_n5850UbiTip = new boolean[] {false} ;
      P020G2_A5838UbiCod = new String[] {""} ;
      P020G2_n5838UbiCod = new boolean[] {false} ;
      P020G2_A5849UbiLin = new short[1] ;
      A5850UbiTip = "" ;
      A5838UbiCod = "" ;
      P020G4_A396EmprCod = new String[] {""} ;
      P020G4_A966PartCod = new String[] {""} ;
      P020G4_A252CliCod = new int[1] ;
      P020G4_A5848ParUbiLin = new short[1] ;
      P020G4_n5848ParUbiLin = new boolean[] {false} ;
      A5851UbiFecMov = GXutil.nullDate() ;
      A5852UbiKilEnt = DecimalUtil.ZERO ;
      A5854UbiKilUti = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      A5857UbiOkTi = "" ;
      A5856UbiObs = "" ;
      A5898UbiCie = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pubiact__default(),
         new Object[] {
             new Object[] {
            P020G2_A396EmprCod, P020G2_A966PartCod, P020G2_A252CliCod, P020G2_A5834UbiAlbHdr, P020G2_n5834UbiAlbHdr, P020G2_A5850UbiTip, P020G2_n5850UbiTip, P020G2_A5838UbiCod, P020G2_n5838UbiCod, P020G2_A5849UbiLin
            }
            , new Object[] {
            }
            , new Object[] {
            P020G4_A396EmprCod, P020G4_A966PartCod, P020G4_A252CliCod, P020G4_A5848ParUbiLin, P020G4_n5848ParUbiLin
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

   private byte AV10Tipo ;
   private short AV13UbiConEnt ;
   private short AV18UbiConUti ;
   private short AV19ManCod ;
   private short A5849UbiLin ;
   private short A5848ParUbiLin ;
   private short AV8UbiLin ;
   private short A5853UbiConEnt ;
   private short A5855UbiConUti ;
   private short A2248ManCod ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV11Albaran ;
   private int A5834UbiAlbHdr ;
   private int GX_INS858 ;
   private java.math.BigDecimal AV12UbiKilEnt ;
   private java.math.BigDecimal AV17UbiKilUti ;
   private java.math.BigDecimal A5852UbiKilEnt ;
   private java.math.BigDecimal A5854UbiKilUti ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String AV14Ok_Tint ;
   private String AV9UbiCod ;
   private String AV20FasCod ;
   private String AV16UbiObs ;
   private String AV23Opcion ;
   private String scmdbuf ;
   private String A5850UbiTip ;
   private String A5838UbiCod ;
   private String A457FasCod ;
   private String A5857UbiOkTi ;
   private String A5856UbiObs ;
   private String A5898UbiCie ;
   private String Gx_emsg ;
   private java.util.Date AV15Fecha ;
   private java.util.Date A5851UbiFecMov ;
   private boolean n5834UbiAlbHdr ;
   private boolean n5850UbiTip ;
   private boolean n5838UbiCod ;
   private boolean n5848ParUbiLin ;
   private boolean n5851UbiFecMov ;
   private boolean n5852UbiKilEnt ;
   private boolean n5853UbiConEnt ;
   private boolean n5854UbiKilUti ;
   private boolean n5855UbiConUti ;
   private boolean n2248ManCod ;
   private boolean n457FasCod ;
   private boolean n5857UbiOkTi ;
   private boolean n5856UbiObs ;
   private boolean n5898UbiCie ;
   private String[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private int[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private byte[] aP6 ;
   private String[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private short[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private short[] aP11 ;
   private short[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P020G2_A396EmprCod ;
   private String[] P020G2_A966PartCod ;
   private int[] P020G2_A252CliCod ;
   private int[] P020G2_A5834UbiAlbHdr ;
   private boolean[] P020G2_n5834UbiAlbHdr ;
   private String[] P020G2_A5850UbiTip ;
   private boolean[] P020G2_n5850UbiTip ;
   private String[] P020G2_A5838UbiCod ;
   private boolean[] P020G2_n5838UbiCod ;
   private short[] P020G2_A5849UbiLin ;
   private String[] P020G4_A396EmprCod ;
   private String[] P020G4_A966PartCod ;
   private int[] P020G4_A252CliCod ;
   private short[] P020G4_A5848ParUbiLin ;
   private boolean[] P020G4_n5848ParUbiLin ;
}

final  class pubiact__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P020G2", "SELECT EmprCod, PartCod, CliCod, UbiAlbHdr, UbiTip, UbiCod, UbiLin FROM TXPUBIMTO WHERE (EmprCod = ? and CliCod = ? and PartCod = ? and UbiCod = ?) AND (UbiAlbHdr = ?) ORDER BY EmprCod, CliCod, PartCod, UbiCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P020G3", "DELETE FROM TXPUBIMTO  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND UbiLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIMTO")
         ,new ForEachCursor("P020G4", "SELECT EmprCod, PartCod, CliCod, ParUbiLin FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P020G5", "INSERT INTO TXPUBIMTO(EmprCod, PartCod, CliCod, UbiLin, UbiCod, UbiTip, UbiAlbHdr, UbiFecMov, UbiKilEnt, UbiConEnt, UbiKilUti, UbiConUti, ManCod, FasCod, UbiObs, UbiOkTi, UbiCie, UbiPre) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIMTO")
         ,new UpdateCursor("P020G6", "UPDATE TXPCPARTI SET ParUbiLin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 2);
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
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[11]);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[23], 8);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[29], 1);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

