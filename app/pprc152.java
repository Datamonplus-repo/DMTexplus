package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprc152 extends GXProcedure
{
   public pprc152( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprc152.class ), "" );
   }

   public pprc152( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pprc152.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pprc152.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprc152.this.A2809MetTerCod = aP1[0];
      this.aP1 = aP1;
      pprc152.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pprc152.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pprc152.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pprc152.this.AV8MetPiecod = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05O22 */
      pr_default.execute(0, new Object[] {A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13007MetPieNum = P05O22_A13007MetPieNum[0] ;
         n13007MetPieNum = P05O22_n13007MetPieNum[0] ;
         AV9Npieza = (int)(A13007MetPieNum+1) ;
         A13007MetPieNum = AV9Npieza ;
         n13007MetPieNum = false ;
         AV8MetPiecod = GXutil.padl( GXutil.trim( GXutil.str( AV9Npieza, 9, 0)), (short)(9), "0") ;
         /* Using cursor P05O23 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n13007MetPieNum), Integer.valueOf(A13007MetPieNum), A396EmprCod, A2809MetTerCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMETPI");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprc152.this.A396EmprCod;
      this.aP1[0] = pprc152.this.A2809MetTerCod;
      this.aP2[0] = pprc152.this.A129BarCod;
      this.aP3[0] = pprc152.this.A132BarCodReo;
      this.aP4[0] = pprc152.this.A130BarCodPar;
      this.aP5[0] = pprc152.this.AV8MetPiecod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pprc152");
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
      P05O22_A396EmprCod = new String[] {""} ;
      P05O22_A2809MetTerCod = new String[] {""} ;
      P05O22_A129BarCod = new int[1] ;
      P05O22_A132BarCodReo = new byte[1] ;
      P05O22_A130BarCodPar = new String[] {""} ;
      P05O22_A13007MetPieNum = new int[1] ;
      P05O22_n13007MetPieNum = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprc152__default(),
         new Object[] {
             new Object[] {
            P05O22_A396EmprCod, P05O22_A2809MetTerCod, P05O22_A129BarCod, P05O22_A132BarCodReo, P05O22_A130BarCodPar, P05O22_A13007MetPieNum, P05O22_n13007MetPieNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A13007MetPieNum ;
   private int AV9Npieza ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String AV8MetPiecod ;
   private String scmdbuf ;
   private boolean n13007MetPieNum ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05O22_A396EmprCod ;
   private String[] P05O22_A2809MetTerCod ;
   private int[] P05O22_A129BarCod ;
   private byte[] P05O22_A132BarCodReo ;
   private String[] P05O22_A130BarCodPar ;
   private int[] P05O22_A13007MetPieNum ;
   private boolean[] P05O22_n13007MetPieNum ;
}

final  class pprc152__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05O22", "SELECT EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar, MetPieNum FROM TXPCMETPI WHERE EmprCod = ? and MetTerCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, MetTerCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P05O23", "UPDATE TXPCMETPI SET MetPieNum=?  WHERE EmprCod = ? AND MetTerCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMETPI")
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 10);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               return;
      }
   }

}

