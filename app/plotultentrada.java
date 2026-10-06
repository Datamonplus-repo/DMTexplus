package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class plotultentrada extends GXProcedure
{
   public plotultentrada( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( plotultentrada.class ), "" );
   }

   public plotultentrada( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      plotultentrada.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      plotultentrada.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      plotultentrada.this.A719PrdNum = aP1[0];
      this.aP1 = aP1;
      plotultentrada.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8EntLotN = "" ;
      /* Using cursor P091P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A411EntCon = P091P2_A411EntCon[0] ;
         A5686EntLotN = P091P2_A5686EntLotN[0] ;
         A415EntFecEnt = P091P2_A415EntFecEnt[0] ;
         A597LinEnt = P091P2_A597LinEnt[0] ;
         AV8EntLotN = A5686EntLotN ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = plotultentrada.this.A396EmprCod;
      this.aP1[0] = plotultentrada.this.A719PrdNum;
      this.aP2[0] = plotultentrada.this.AV8EntLotN;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8EntLotN = "" ;
      scmdbuf = "" ;
      P091P2_A396EmprCod = new String[] {""} ;
      P091P2_A719PrdNum = new String[] {""} ;
      P091P2_A411EntCon = new byte[1] ;
      P091P2_A5686EntLotN = new String[] {""} ;
      P091P2_A415EntFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P091P2_A597LinEnt = new short[1] ;
      A5686EntLotN = "" ;
      A415EntFecEnt = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.plotultentrada__default(),
         new Object[] {
             new Object[] {
            P091P2_A396EmprCod, P091P2_A719PrdNum, P091P2_A411EntCon, P091P2_A5686EntLotN, P091P2_A415EntFecEnt, P091P2_A597LinEnt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A411EntCon ;
   private short A597LinEnt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV8EntLotN ;
   private String scmdbuf ;
   private String A5686EntLotN ;
   private java.util.Date A415EntFecEnt ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P091P2_A396EmprCod ;
   private String[] P091P2_A719PrdNum ;
   private byte[] P091P2_A411EntCon ;
   private String[] P091P2_A5686EntLotN ;
   private java.util.Date[] P091P2_A415EntFecEnt ;
   private short[] P091P2_A597LinEnt ;
}

final  class plotultentrada__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091P2", "SELECT * FROM (SELECT EmprCod, PrdNum, EntCon, EntLotN, EntFecEnt, LinEnt FROM TXPENTALM WHERE (EmprCod = ? and PrdNum = ?) AND ((EntCon = 0)) ORDER BY EmprCod, PrdNum, EntFecEnt) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

