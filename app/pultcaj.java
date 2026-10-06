package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pultcaj extends GXProcedure
{
   public pultcaj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pultcaj.class ), "" );
   }

   public pultcaj( int remoteHandle ,
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
      pultcaj.this.aP5 = new String[] {""};
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
      pultcaj.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pultcaj.this.A2792TermiCod = aP1[0];
      this.aP1 = aP1;
      pultcaj.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pultcaj.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pultcaj.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pultcaj.this.AV8UltPza = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P036O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2813MetPieCod = P036O2_A2813MetPieCod[0] ;
         A2809MetTerCod = P036O2_A2809MetTerCod[0] ;
         AV8UltPza = A2813MetPieCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV11ContPza = (int)(GXutil.lval( AV8UltPza)+1) ;
      AV8UltPza = GXutil.trim( GXutil.str( AV11ContPza, 9, 0)) ;
      AV12Ceros2 = "00" ;
      AV8UltPza = GXutil.ltrim( GXutil.rtrim( AV8UltPza)) ;
      AV13LenVar = (byte)(GXutil.len( GXutil.trim( AV8UltPza))) ;
      AV13LenVar = (byte)(2-AV13LenVar) ;
      AV8UltPza = GXutil.substring( AV12Ceros2, 1, AV13LenVar) + AV8UltPza ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pultcaj.this.A396EmprCod;
      this.aP1[0] = pultcaj.this.A2792TermiCod;
      this.aP2[0] = pultcaj.this.A129BarCod;
      this.aP3[0] = pultcaj.this.A132BarCodReo;
      this.aP4[0] = pultcaj.this.A130BarCodPar;
      this.aP5[0] = pultcaj.this.AV8UltPza;
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
      P036O2_A396EmprCod = new String[] {""} ;
      P036O2_A129BarCod = new int[1] ;
      P036O2_A132BarCodReo = new byte[1] ;
      P036O2_A130BarCodPar = new String[] {""} ;
      P036O2_A2813MetPieCod = new String[] {""} ;
      P036O2_A2809MetTerCod = new String[] {""} ;
      A2813MetPieCod = "" ;
      A2809MetTerCod = "" ;
      AV12Ceros2 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pultcaj__default(),
         new Object[] {
             new Object[] {
            P036O2_A396EmprCod, P036O2_A129BarCod, P036O2_A132BarCodReo, P036O2_A130BarCodPar, P036O2_A2813MetPieCod, P036O2_A2809MetTerCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV13LenVar ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV11ContPza ;
   private String A396EmprCod ;
   private String A2792TermiCod ;
   private String A130BarCodPar ;
   private String AV8UltPza ;
   private String scmdbuf ;
   private String A2813MetPieCod ;
   private String A2809MetTerCod ;
   private String AV12Ceros2 ;
   private String[] aP5 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P036O2_A396EmprCod ;
   private int[] P036O2_A129BarCod ;
   private byte[] P036O2_A132BarCodReo ;
   private String[] P036O2_A130BarCodPar ;
   private String[] P036O2_A2813MetPieCod ;
   private String[] P036O2_A2809MetTerCod ;
}

final  class pultcaj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036O2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod, MetTerCod FROM TXPLMETPI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

