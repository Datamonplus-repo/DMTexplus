package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbushra extends GXProcedure
{
   public pbushra( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbushra.class ), "" );
   }

   public pbushra( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          int[] aP4 ,
                          String[] aP5 ,
                          String[] aP6 )
   {
      pbushra.this.aP7 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        int[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             int[] aP7 )
   {
      pbushra.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbushra.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pbushra.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbushra.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbushra.this.AV16CliCod = aP4[0];
      this.aP4 = aP4;
      pbushra.this.AV17Serie = aP5[0];
      this.aP5 = aP5;
      pbushra.this.AV18Color = aP6[0];
      this.aP6 = aP6;
      pbushra.this.AV19ColNum = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00K42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P00K42_A252CliCod[0] ;
         n252CliCod = P00K42_n252CliCod[0] ;
         A136BarColNum = P00K42_A136BarColNum[0] ;
         A135BarColNom = P00K42_A135BarColNom[0] ;
         A212BarSer = P00K42_A212BarSer[0] ;
         AV16CliCod = A252CliCod ;
         AV19ColNum = A136BarColNum ;
         AV18Color = A135BarColNom ;
         AV17Serie = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbushra.this.A396EmprCod;
      this.aP1[0] = pbushra.this.A129BarCod;
      this.aP2[0] = pbushra.this.A132BarCodReo;
      this.aP3[0] = pbushra.this.A130BarCodPar;
      this.aP4[0] = pbushra.this.AV16CliCod;
      this.aP5[0] = pbushra.this.AV17Serie;
      this.aP6[0] = pbushra.this.AV18Color;
      this.aP7[0] = pbushra.this.AV19ColNum;
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
      P00K42_A396EmprCod = new String[] {""} ;
      P00K42_A129BarCod = new int[1] ;
      P00K42_A132BarCodReo = new byte[1] ;
      P00K42_A130BarCodPar = new String[] {""} ;
      P00K42_A252CliCod = new int[1] ;
      P00K42_n252CliCod = new boolean[] {false} ;
      P00K42_A136BarColNum = new int[1] ;
      P00K42_A135BarColNom = new String[] {""} ;
      P00K42_A212BarSer = new String[] {""} ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbushra__default(),
         new Object[] {
             new Object[] {
            P00K42_A396EmprCod, P00K42_A129BarCod, P00K42_A132BarCodReo, P00K42_A130BarCodPar, P00K42_A252CliCod, P00K42_n252CliCod, P00K42_A136BarColNum, P00K42_A135BarColNom, P00K42_A212BarSer
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV16CliCod ;
   private int AV19ColNum ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV17Serie ;
   private String AV18Color ;
   private String scmdbuf ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private boolean n252CliCod ;
   private int[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00K42_A396EmprCod ;
   private int[] P00K42_A129BarCod ;
   private byte[] P00K42_A132BarCodReo ;
   private String[] P00K42_A130BarCodPar ;
   private int[] P00K42_A252CliCod ;
   private boolean[] P00K42_n252CliCod ;
   private int[] P00K42_A136BarColNum ;
   private String[] P00K42_A135BarColNom ;
   private String[] P00K42_A212BarSer ;
}

final  class pbushra__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00K42", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, CliCod, BarColNum, BarColNom, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
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

