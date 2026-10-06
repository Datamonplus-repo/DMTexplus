package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinslot5 extends GXProcedure
{
   public pinslot5( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinslot5.class ), "" );
   }

   public pinslot5( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      pinslot5.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      pinslot5.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8UsurCod = " " ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pinslot5.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      pinslot5.this.A396EmprCod = GXv_char2[0] ;
      pinslot5.this.AV10EmprNom = GXv_char3[0] ;
      pinslot5.this.AV8UsurCod = GXv_char4[0] ;
      AV24Last_EncPart = " " ;
      /* Using cursor P061Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13524InsHdr = P061Y2_A13524InsHdr[0] ;
         A13527InsEncPda = P061Y2_A13527InsEncPda[0] ;
         n13527InsEncPda = P061Y2_n13527InsEncPda[0] ;
         if ( GXutil.strcmp(AV24Last_EncPart, A13527InsEncPda) != 0 )
         {
            GXt_int5 = AV18NumLote ;
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = httpContext.getMessage( "NOLT00", "") ;
            GXv_int6[0] = GXt_int5 ;
            new app.precagr(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
            pinslot5.this.A396EmprCod = GXv_char4[0] ;
            pinslot5.this.GXt_int5 = GXv_int6[0] ;
            AV18NumLote = GXt_int5 ;
         }
         AV20Barcod = (int)(GXutil.lval( GXutil.substring( A13524InsHdr, 1, 8))) ;
         AV21barcodreo = (byte)(GXutil.lval( GXutil.substring( A13524InsHdr, 9, 1))) ;
         AV22barcodpar = GXutil.substring( A13524InsHdr, 10, 1) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV24Last_EncPart = A13527InsEncPda ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P061Y3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV20Barcod), Byte.valueOf(AV21barcodreo), AV22barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P061Y3_A130BarCodPar[0] ;
         A132BarCodReo = P061Y3_A132BarCodReo[0] ;
         A129BarCod = P061Y3_A129BarCod[0] ;
         A3746BarNPed = P061Y3_A3746BarNPed[0] ;
         AV25Inc_obs = httpContext.getMessage( "Actualizo LOTE", "") + GXutil.newLine( ) ;
         AV25Inc_obs += httpContext.getMessage( "Lote N ", "") + GXutil.str( AV18NumLote, 10, 0) + GXutil.newLine( ) ;
         A3746BarNPed = GXutil.str( AV18NumLote, 10, 0) ;
         AV14Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + A3746BarNPed ;
         System.out.println( AV14Control );
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV30Pgmname, AV8UsurCod, AV9Station, AV25Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P061Y4 */
         pr_default.execute(2, new Object[] {A3746BarNPed, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinslot5.this.A396EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinslot5");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV10EmprNom = "" ;
      AV24Last_EncPart = "" ;
      scmdbuf = "" ;
      P061Y2_A396EmprCod = new String[] {""} ;
      P061Y2_A13524InsHdr = new String[] {""} ;
      P061Y2_A13527InsEncPda = new String[] {""} ;
      P061Y2_n13527InsEncPda = new boolean[] {false} ;
      A13524InsHdr = "" ;
      A13527InsEncPda = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new long[1] ;
      AV22barcodpar = "" ;
      P061Y3_A396EmprCod = new String[] {""} ;
      P061Y3_A130BarCodPar = new String[] {""} ;
      P061Y3_A132BarCodReo = new byte[1] ;
      P061Y3_A129BarCod = new int[1] ;
      P061Y3_A3746BarNPed = new String[] {""} ;
      A130BarCodPar = "" ;
      A3746BarNPed = "" ;
      AV25Inc_obs = "" ;
      AV14Control = "" ;
      AV30Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinslot5__default(),
         new Object[] {
             new Object[] {
            P061Y2_A396EmprCod, P061Y2_A13524InsHdr, P061Y2_A13527InsEncPda, P061Y2_n13527InsEncPda
            }
            , new Object[] {
            P061Y3_A396EmprCod, P061Y3_A130BarCodPar, P061Y3_A132BarCodReo, P061Y3_A129BarCod, P061Y3_A3746BarNPed
            }
            , new Object[] {
            }
         }
      );
      AV30Pgmname = "PInsLOT5" ;
      /* GeneXus formulas. */
      AV30Pgmname = "PInsLOT5" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21barcodreo ;
   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV20Barcod ;
   private int A129BarCod ;
   private long AV18NumLote ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String A396EmprCod ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV10EmprNom ;
   private String AV24Last_EncPart ;
   private String scmdbuf ;
   private String A13524InsHdr ;
   private String A13527InsEncPda ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV22barcodpar ;
   private String A130BarCodPar ;
   private String A3746BarNPed ;
   private String AV30Pgmname ;
   private boolean n13527InsEncPda ;
   private boolean returnInSub ;
   private String AV25Inc_obs ;
   private String AV14Control ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P061Y2_A396EmprCod ;
   private String[] P061Y2_A13524InsHdr ;
   private String[] P061Y2_A13527InsEncPda ;
   private boolean[] P061Y2_n13527InsEncPda ;
   private String[] P061Y3_A396EmprCod ;
   private String[] P061Y3_A130BarCodPar ;
   private byte[] P061Y3_A132BarCodReo ;
   private int[] P061Y3_A129BarCod ;
   private String[] P061Y3_A3746BarNPed ;
}

final  class pinslot5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P061Y2", "SELECT EmprCod, InsHdr, InsEncPda FROM TXPINSLOT WHERE EmprCod = ? ORDER BY EmprCod, InsEncPda ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P061Y3", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarNPed FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P061Y4", "UPDATE TXPBARCAD SET BarNPed=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 24);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

