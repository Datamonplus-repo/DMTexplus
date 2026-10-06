package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getlblineaprocesosquimicos extends GXProcedure
{
   public getlblineaprocesosquimicos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getlblineaprocesosquimicos.class ), "" );
   }

   public getlblineaprocesosquimicos( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 ,
                            String aP3 ,
                            int aP4 ,
                            byte aP5 )
   {
      getlblineaprocesosquimicos.this.aP6 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        short[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             short[] aP6 )
   {
      getlblineaprocesosquimicos.this.AV10EmprCod = aP0;
      getlblineaprocesosquimicos.this.AV16clicod = aP1;
      getlblineaprocesosquimicos.this.AV15Forser = aP2;
      getlblineaprocesosquimicos.this.AV14Forcolnom = aP3;
      getlblineaprocesosquimicos.this.AV13Forcolnum = aP4;
      getlblineaprocesosquimicos.this.AV12TipColcod = aP5;
      getlblineaprocesosquimicos.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Lb_LineaC = (short)(0) ;
      /* Using cursor P0AD92 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Integer.valueOf(AV16clicod), AV15Forser, AV14Forcolnom, Integer.valueOf(AV13Forcolnum), Byte.valueOf(AV12TipColcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AD92_A396EmprCod[0] ;
         A252CliCod = P0AD92_A252CliCod[0] ;
         A494ForSer = P0AD92_A494ForSer[0] ;
         A482ForColNom = P0AD92_A482ForColNom[0] ;
         A483ForColNum = P0AD92_A483ForColNum[0] ;
         A831TipColCod = P0AD92_A831TipColCod[0] ;
         A1160ProForL = P0AD92_A1160ProForL[0] ;
         A764ProForCod = P0AD92_A764ProForCod[0] ;
         AV9Lb_LineaC = A1160ProForL ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "&Lb_LineaC=", "")+GXutil.str( AV9Lb_LineaC, 4, 0) );
      AV9Lb_LineaC = (short)(AV9Lb_LineaC+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = getlblineaprocesosquimicos.this.AV9Lb_LineaC;
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
      P0AD92_A396EmprCod = new String[] {""} ;
      P0AD92_A252CliCod = new int[1] ;
      P0AD92_A494ForSer = new String[] {""} ;
      P0AD92_A482ForColNom = new String[] {""} ;
      P0AD92_A483ForColNum = new int[1] ;
      P0AD92_A831TipColCod = new byte[1] ;
      P0AD92_A1160ProForL = new short[1] ;
      P0AD92_A764ProForCod = new String[] {""} ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.getlblineaprocesosquimicos__default(),
         new Object[] {
             new Object[] {
            P0AD92_A396EmprCod, P0AD92_A252CliCod, P0AD92_A494ForSer, P0AD92_A482ForColNom, P0AD92_A483ForColNum, P0AD92_A831TipColCod, P0AD92_A1160ProForL, P0AD92_A764ProForCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TipColcod ;
   private byte A831TipColCod ;
   private short AV9Lb_LineaC ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int AV16clicod ;
   private int AV13Forcolnum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String AV10EmprCod ;
   private String AV15Forser ;
   private String AV14Forcolnom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A764ProForCod ;
   private short[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AD92_A396EmprCod ;
   private int[] P0AD92_A252CliCod ;
   private String[] P0AD92_A494ForSer ;
   private String[] P0AD92_A482ForColNom ;
   private int[] P0AD92_A483ForColNum ;
   private byte[] P0AD92_A831TipColCod ;
   private short[] P0AD92_A1160ProForL ;
   private String[] P0AD92_A764ProForCod ;
}

final  class getlblineaprocesosquimicos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD92", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL, ProForCod FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForCod, ProForL DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

