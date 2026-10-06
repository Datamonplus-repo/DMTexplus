package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plhipct extends GXProcedure
{
   public plhipct( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plhipct.class ), "" );
   }

   public plhipct( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 )
   {
      plhipct.this.aP4 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      plhipct.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plhipct.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      plhipct.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      plhipct.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      plhipct.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Lhipro = (byte)(0) ;
      /* Using cursor P02IW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A566HisProTur = P02IW2_A566HisProTur[0] ;
         A602MaqCod = P02IW2_A602MaqCod[0] ;
         A558HisProFec = P02IW2_A558HisProFec[0] ;
         A561HisProLin = P02IW2_A561HisProLin[0] ;
         AV8Lhipro = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plhipct.this.A396EmprCod;
      this.aP1[0] = plhipct.this.A129BarCod;
      this.aP2[0] = plhipct.this.A132BarCodReo;
      this.aP3[0] = plhipct.this.A130BarCodPar;
      this.aP4[0] = plhipct.this.AV8Lhipro;
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
      P02IW2_A396EmprCod = new String[] {""} ;
      P02IW2_A129BarCod = new int[1] ;
      P02IW2_A132BarCodReo = new byte[1] ;
      P02IW2_A130BarCodPar = new String[] {""} ;
      P02IW2_A566HisProTur = new byte[1] ;
      P02IW2_A602MaqCod = new String[] {""} ;
      P02IW2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P02IW2_A561HisProLin = new int[1] ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plhipct__default(),
         new Object[] {
             new Object[] {
            P02IW2_A396EmprCod, P02IW2_A129BarCod, P02IW2_A132BarCodReo, P02IW2_A130BarCodPar, P02IW2_A566HisProTur, P02IW2_A602MaqCod, P02IW2_A558HisProFec, P02IW2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV8Lhipro ;
   private byte A566HisProTur ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private java.util.Date A558HisProFec ;
   private byte[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02IW2_A396EmprCod ;
   private int[] P02IW2_A129BarCod ;
   private byte[] P02IW2_A132BarCodReo ;
   private String[] P02IW2_A130BarCodPar ;
   private byte[] P02IW2_A566HisProTur ;
   private String[] P02IW2_A602MaqCod ;
   private java.util.Date[] P02IW2_A558HisProFec ;
   private int[] P02IW2_A561HisProLin ;
}

final  class plhipct__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02IW2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, HisProTur, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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

