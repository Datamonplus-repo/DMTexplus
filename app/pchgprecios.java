package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pchgprecios extends GXProcedure
{
   public pchgprecios( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pchgprecios.class ), "" );
   }

   public pchgprecios( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            byte[] aP3 ,
                            byte[] aP4 )
   {
      pchgprecios.this.aP5 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 ,
                        byte[] aP4 ,
                        short[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 ,
                             byte[] aP4 ,
                             short[] aP5 )
   {
      pchgprecios.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pchgprecios.this.AV19Clicod = aP1[0];
      this.aP1 = aP1;
      pchgprecios.this.AV20ArtCod = aP2[0];
      this.aP2 = aP2;
      pchgprecios.this.AV21TipColCod = aP3[0];
      this.aP3 = aP3;
      pchgprecios.this.AV23IntCod = aP4[0];
      this.aP4 = aP4;
      pchgprecios.this.AV22TipArtCod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV24Tab_artcod[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      AV25i = (short)(1) ;
      /* Using cursor P04P52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV19Clicod), Short.valueOf(AV22TipArtCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P04P52_A252CliCod[0] ;
         A829TipArtCod = P04P52_A829TipArtCod[0] ;
         A65ArtCod = P04P52_A65ArtCod[0] ;
         if ( GXutil.strcmp(A65ArtCod, AV20ArtCod) != 0 )
         {
            AV24Tab_artcod[AV25i-1] = A65ArtCod ;
            AV25i = (short)(AV25i+1) ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV25i = (short)(1) ;
      while ( AV25i <= 1000 )
      {
         if ( GXutil.strcmp(AV24Tab_artcod[AV25i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV26Artcod2 = AV24Tab_artcod[AV25i-1] ;
         /* Using cursor P04P53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19Clicod), AV20ArtCod, Byte.valueOf(AV21TipColCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A831TipColCod = P04P53_A831TipColCod[0] ;
            A65ArtCod = P04P53_A65ArtCod[0] ;
            A252CliCod = P04P53_A252CliCod[0] ;
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W831TipColCod = A831TipColCod ;
            Gx_msg = httpContext.getMessage( "Actualizando...Precios.. ", "") + GXutil.str( A252CliCod, 6, 0) + " " + A65ArtCod + " " + GXutil.str( AV21TipColCod, 2, 0) + " " + GXutil.str( AV22TipArtCod, 4, 0) ;
            System.out.println( Gx_msg );
            /*
               INSERT RECORD ON TABLE TXPPRETCO

            */
            W396EmprCod = A396EmprCod ;
            W252CliCod = A252CliCod ;
            W65ArtCod = A65ArtCod ;
            W831TipColCod = A831TipColCod ;
            A252CliCod = AV19Clicod ;
            A65ArtCod = AV26Artcod2 ;
            A831TipColCod = AV21TipColCod ;
            /* Using cursor P04P54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETCO");
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
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A831TipColCod = W831TipColCod ;
            /* End Insert */
            /* Using cursor P04P55 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(AV23IntCod)});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A583IntCod = P04P55_A583IntCod[0] ;
               A3616PreFacCod = P04P55_A3616PreFacCod[0] ;
               n3616PreFacCod = P04P55_n3616PreFacCod[0] ;
               A585IntPreDef = P04P55_A585IntPreDef[0] ;
               n585IntPreDef = P04P55_n585IntPreDef[0] ;
               A587IntPreMtr = P04P55_A587IntPreMtr[0] ;
               n587IntPreMtr = P04P55_n587IntPreMtr[0] ;
               A586IntPreKgm = P04P55_A586IntPreKgm[0] ;
               n586IntPreKgm = P04P55_n586IntPreKgm[0] ;
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W831TipColCod = A831TipColCod ;
               W583IntCod = A583IntCod ;
               AV27IntPreKgm = A586IntPreKgm ;
               AV28IntPreMtr = A587IntPreMtr ;
               /*
                  INSERT RECORD ON TABLE TXPPRETIN

               */
               W396EmprCod = A396EmprCod ;
               W252CliCod = A252CliCod ;
               W65ArtCod = A65ArtCod ;
               W831TipColCod = A831TipColCod ;
               W583IntCod = A583IntCod ;
               W586IntPreKgm = A586IntPreKgm ;
               n586IntPreKgm = false ;
               W587IntPreMtr = A587IntPreMtr ;
               n587IntPreMtr = false ;
               A252CliCod = AV19Clicod ;
               A65ArtCod = AV26Artcod2 ;
               A831TipColCod = AV21TipColCod ;
               A583IntCod = AV23IntCod ;
               n586IntPreKgm = false ;
               n587IntPreMtr = false ;
               /* Using cursor P04P56 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n586IntPreKgm), A586IntPreKgm, Boolean.valueOf(n587IntPreMtr), A587IntPreMtr, Boolean.valueOf(n585IntPreDef), A585IntPreDef, Boolean.valueOf(n3616PreFacCod), A3616PreFacCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
               if ( (pr_default.getStatus(4) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
                  n587IntPreMtr = false ;
                  n586IntPreKgm = false ;
                  /* Optimized UPDATE. */
                  /* Using cursor P04P57 */
                  pr_default.execute(5, new Object[] {Boolean.valueOf(n587IntPreMtr), AV28IntPreMtr, Boolean.valueOf(n586IntPreKgm), AV27IntPreKgm, A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
                  /* End optimized UPDATE. */
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A831TipColCod = W831TipColCod ;
               A583IntCod = W583IntCod ;
               A586IntPreKgm = W586IntPreKgm ;
               n586IntPreKgm = false ;
               A587IntPreMtr = W587IntPreMtr ;
               n587IntPreMtr = false ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A252CliCod = W252CliCod ;
               A65ArtCod = W65ArtCod ;
               A831TipColCod = W831TipColCod ;
               A583IntCod = W583IntCod ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(3);
            A396EmprCod = W396EmprCod ;
            A252CliCod = W252CliCod ;
            A65ArtCod = W65ArtCod ;
            A831TipColCod = W831TipColCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV25i = (short)(AV25i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pchgprecios.this.A396EmprCod;
      this.aP1[0] = pchgprecios.this.AV19Clicod;
      this.aP2[0] = pchgprecios.this.AV20ArtCod;
      this.aP3[0] = pchgprecios.this.AV21TipColCod;
      this.aP4[0] = pchgprecios.this.AV23IntCod;
      this.aP5[0] = pchgprecios.this.AV22TipArtCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pchgprecios");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24Tab_artcod = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV24Tab_artcod[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P04P52_A396EmprCod = new String[] {""} ;
      P04P52_A252CliCod = new int[1] ;
      P04P52_A829TipArtCod = new short[1] ;
      P04P52_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      AV26Artcod2 = "" ;
      P04P53_A396EmprCod = new String[] {""} ;
      P04P53_A831TipColCod = new byte[1] ;
      P04P53_A65ArtCod = new String[] {""} ;
      P04P53_A252CliCod = new int[1] ;
      W396EmprCod = "" ;
      W65ArtCod = "" ;
      Gx_msg = "" ;
      Gx_emsg = "" ;
      P04P55_A396EmprCod = new String[] {""} ;
      P04P55_A252CliCod = new int[1] ;
      P04P55_A65ArtCod = new String[] {""} ;
      P04P55_A831TipColCod = new byte[1] ;
      P04P55_A583IntCod = new byte[1] ;
      P04P55_A3616PreFacCod = new String[] {""} ;
      P04P55_n3616PreFacCod = new boolean[] {false} ;
      P04P55_A585IntPreDef = new String[] {""} ;
      P04P55_n585IntPreDef = new boolean[] {false} ;
      P04P55_A587IntPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04P55_n587IntPreMtr = new boolean[] {false} ;
      P04P55_A586IntPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04P55_n586IntPreKgm = new boolean[] {false} ;
      A3616PreFacCod = "" ;
      A585IntPreDef = "" ;
      A587IntPreMtr = DecimalUtil.ZERO ;
      A586IntPreKgm = DecimalUtil.ZERO ;
      AV27IntPreKgm = DecimalUtil.ZERO ;
      AV28IntPreMtr = DecimalUtil.ZERO ;
      W586IntPreKgm = DecimalUtil.ZERO ;
      W587IntPreMtr = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pchgprecios__default(),
         new Object[] {
             new Object[] {
            P04P52_A396EmprCod, P04P52_A252CliCod, P04P52_A829TipArtCod, P04P52_A65ArtCod
            }
            , new Object[] {
            P04P53_A396EmprCod, P04P53_A831TipColCod, P04P53_A65ArtCod, P04P53_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04P55_A396EmprCod, P04P55_A252CliCod, P04P55_A65ArtCod, P04P55_A831TipColCod, P04P55_A583IntCod, P04P55_A3616PreFacCod, P04P55_n3616PreFacCod, P04P55_A585IntPreDef, P04P55_n585IntPreDef, P04P55_A587IntPreMtr,
            P04P55_n587IntPreMtr, P04P55_A586IntPreKgm, P04P55_n586IntPreKgm
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

   private byte AV21TipColCod ;
   private byte AV23IntCod ;
   private byte A831TipColCod ;
   private byte W831TipColCod ;
   private byte A583IntCod ;
   private byte W583IntCod ;
   private short AV22TipArtCod ;
   private short AV25i ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private int AV19Clicod ;
   private int GX_I ;
   private int A252CliCod ;
   private int W252CliCod ;
   private int GX_INS83 ;
   private int GX_INS84 ;
   private java.math.BigDecimal A587IntPreMtr ;
   private java.math.BigDecimal A586IntPreKgm ;
   private java.math.BigDecimal AV27IntPreKgm ;
   private java.math.BigDecimal AV28IntPreMtr ;
   private java.math.BigDecimal W586IntPreKgm ;
   private java.math.BigDecimal W587IntPreMtr ;
   private String A396EmprCod ;
   private String AV20ArtCod ;
   private String AV24Tab_artcod[] ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String AV26Artcod2 ;
   private String W396EmprCod ;
   private String W65ArtCod ;
   private String Gx_msg ;
   private String Gx_emsg ;
   private String A3616PreFacCod ;
   private String A585IntPreDef ;
   private boolean n3616PreFacCod ;
   private boolean n585IntPreDef ;
   private boolean n587IntPreMtr ;
   private boolean n586IntPreKgm ;
   private short[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private byte[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P04P52_A396EmprCod ;
   private int[] P04P52_A252CliCod ;
   private short[] P04P52_A829TipArtCod ;
   private String[] P04P52_A65ArtCod ;
   private String[] P04P53_A396EmprCod ;
   private byte[] P04P53_A831TipColCod ;
   private String[] P04P53_A65ArtCod ;
   private int[] P04P53_A252CliCod ;
   private String[] P04P55_A396EmprCod ;
   private int[] P04P55_A252CliCod ;
   private String[] P04P55_A65ArtCod ;
   private byte[] P04P55_A831TipColCod ;
   private byte[] P04P55_A583IntCod ;
   private String[] P04P55_A3616PreFacCod ;
   private boolean[] P04P55_n3616PreFacCod ;
   private String[] P04P55_A585IntPreDef ;
   private boolean[] P04P55_n585IntPreDef ;
   private java.math.BigDecimal[] P04P55_A587IntPreMtr ;
   private boolean[] P04P55_n587IntPreMtr ;
   private java.math.BigDecimal[] P04P55_A586IntPreKgm ;
   private boolean[] P04P55_n586IntPreKgm ;
}

final  class pchgprecios__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04P52", "SELECT EmprCod, CliCod, TipArtCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and TipArtCod = ? ORDER BY EmprCod, CliCod, TipArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04P53", "SELECT EmprCod, TipColCod, ArtCod, CliCod FROM TXPPRETCO WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04P54", "INSERT INTO TXPPRETCO(EmprCod, CliCod, ArtCod, TipColCod) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETCO")
         ,new ForEachCursor("P04P55", "SELECT EmprCod, CliCod, ArtCod, TipColCod, IntCod, PreFacCod, IntPreDef, IntPreMtr, IntPreKgm FROM TXPPRETIN WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ? ORDER BY EmprCod, CliCod, ArtCod, TipColCod, IntCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04P56", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreKgm, IntPreMtr, IntPreDef, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
         ,new UpdateCursor("P04P57", "UPDATE TXPPRETIN SET IntPreMtr=?, IntPreKgm=?  WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and TipColCod = ? and IntCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 6);
               }
               return;
            case 5 :
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
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 16);
               stmt.setByte(6, ((Number) parms[7]).byteValue());
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               return;
      }
   }

}

