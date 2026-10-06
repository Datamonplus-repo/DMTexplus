package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pporcobp extends GXProcedure
{
   public pporcobp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pporcobp.class ), "" );
   }

   public pporcobp( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           String aP1 ,
                                           int aP2 ,
                                           int aP3 ,
                                           byte aP4 )
   {
      pporcobp.this.aP5 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        int aP3 ,
                        byte aP4 ,
                        java.math.BigDecimal[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             int aP3 ,
                             byte aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pporcobp.this.A396EmprCod = aP0;
      pporcobp.this.A1013DibCli = aP1;
      pporcobp.this.A252CliCod = aP2;
      pporcobp.this.A1014DibInt = aP3;
      pporcobp.this.AV9DibLinMol = aP4;
      pporcobp.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DibPrcCob = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P03N12 */
      pr_default.execute(0, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Byte.valueOf(AV9DibLinMol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2088DibDibMol = P03N12_A2088DibDibMol[0] ;
         n2088DibDibMol = P03N12_n2088DibDibMol[0] ;
         A5381DibPrcCobM = P03N12_A5381DibPrcCobM[0] ;
         n5381DibPrcCobM = P03N12_n5381DibPrcCobM[0] ;
         A1029DibLin = P03N12_A1029DibLin[0] ;
         AV8DibPrcCob = A5381DibPrcCobM ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = pporcobp.this.AV8DibPrcCob;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8DibPrcCob = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P03N12_A396EmprCod = new String[] {""} ;
      P03N12_A1013DibCli = new String[] {""} ;
      P03N12_A252CliCod = new int[1] ;
      P03N12_A1014DibInt = new int[1] ;
      P03N12_A2088DibDibMol = new byte[1] ;
      P03N12_n2088DibDibMol = new boolean[] {false} ;
      P03N12_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03N12_n5381DibPrcCobM = new boolean[] {false} ;
      P03N12_A1029DibLin = new short[1] ;
      A5381DibPrcCobM = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.pporcobp__default(),
         new Object[] {
             new Object[] {
            P03N12_A396EmprCod, P03N12_A1013DibCli, P03N12_A252CliCod, P03N12_A1014DibInt, P03N12_A2088DibDibMol, P03N12_n2088DibDibMol, P03N12_A5381DibPrcCobM, P03N12_n5381DibPrcCobM, P03N12_A1029DibLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9DibLinMol ;
   private byte A2088DibDibMol ;
   private short A1029DibLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV8DibPrcCob ;
   private java.math.BigDecimal A5381DibPrcCobM ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String scmdbuf ;
   private boolean n2088DibDibMol ;
   private boolean n5381DibPrcCobM ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P03N12_A396EmprCod ;
   private String[] P03N12_A1013DibCli ;
   private int[] P03N12_A252CliCod ;
   private int[] P03N12_A1014DibInt ;
   private byte[] P03N12_A2088DibDibMol ;
   private boolean[] P03N12_n2088DibDibMol ;
   private java.math.BigDecimal[] P03N12_A5381DibPrcCobM ;
   private boolean[] P03N12_n5381DibPrcCobM ;
   private short[] P03N12_A1029DibLin ;
}

final  class pporcobp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03N12", "SELECT EmprCod, DibCli, CliCod, DibInt, DibDibMol, DibPrcCobM, DibLin FROM TXPLDIBUJ WHERE (EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ?) AND (DibDibMol = ?) ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

