package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getlblineacc extends GXProcedure
{
   public getlblineacc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getlblineacc.class ), "" );
   }

   public getlblineacc( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      getlblineacc.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             short[] aP3 )
   {
      getlblineacc.this.AV12EmprCod = aP0;
      getlblineacc.this.AV10Lb_numero = aP1;
      getlblineacc.this.AV11Lb_opcion = aP2;
      getlblineacc.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AD22 */
      pr_default.execute(0, new Object[] {AV12EmprCod, Integer.valueOf(AV10Lb_numero), AV11Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P0AD22_A5555Lb_opcion[0] ;
         A5532Lb_numero = P0AD22_A5532Lb_numero[0] ;
         A396EmprCod = P0AD22_A396EmprCod[0] ;
         A5557Lb_LineaC = P0AD22_A5557Lb_LineaC[0] ;
         AV9Lb_LineaC = A5557Lb_LineaC ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV9Lb_LineaC = (short)(AV9Lb_LineaC+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = getlblineacc.this.AV9Lb_LineaC;
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
      P0AD22_A5555Lb_opcion = new String[] {""} ;
      P0AD22_A5532Lb_numero = new int[1] ;
      P0AD22_A396EmprCod = new String[] {""} ;
      P0AD22_A5557Lb_LineaC = new short[1] ;
      A5555Lb_opcion = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.getlblineacc__default(),
         new Object[] {
             new Object[] {
            P0AD22_A5555Lb_opcion, P0AD22_A5532Lb_numero, P0AD22_A396EmprCod, P0AD22_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9Lb_LineaC ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV10Lb_numero ;
   private int A5532Lb_numero ;
   private String AV12EmprCod ;
   private String AV11Lb_opcion ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A396EmprCod ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AD22_A5555Lb_opcion ;
   private int[] P0AD22_A5532Lb_numero ;
   private String[] P0AD22_A396EmprCod ;
   private short[] P0AD22_A5557Lb_LineaC ;
}

final  class getlblineacc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AD22", "SELECT * FROM (SELECT Lb_opcion, Lb_numero, EmprCod, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod DESC, Lb_numero DESC, Lb_opcion DESC, Lb_LineaC DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

