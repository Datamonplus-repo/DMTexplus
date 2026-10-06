package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getcolorantesensayos extends GXProcedure
{
   public getcolorantesensayos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getcolorantesensayos.class ), "" );
   }

   public getcolorantesensayos( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String aP0 ,
                            int aP1 ,
                            String aP2 )
   {
      getcolorantesensayos.this.aP3 = new short[] {0};
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
      getcolorantesensayos.this.AV8EmprCod = aP0;
      getcolorantesensayos.this.AV18lb_numero = aP1;
      getcolorantesensayos.this.AV19lb_opcion = aP2;
      getcolorantesensayos.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0AEE2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, Integer.valueOf(AV18lb_numero), AV19lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AEE2_A396EmprCod[0] ;
         A5532Lb_numero = P0AEE2_A5532Lb_numero[0] ;
         A5555Lb_opcion = P0AEE2_A5555Lb_opcion[0] ;
         A5557Lb_LineaC = P0AEE2_A5557Lb_LineaC[0] ;
         AV17AuxColLin = A5557Lb_LineaC ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV17AuxColLin = (short)(AV17AuxColLin+10) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = getcolorantesensayos.this.AV17AuxColLin;
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
      P0AEE2_A396EmprCod = new String[] {""} ;
      P0AEE2_A5532Lb_numero = new int[1] ;
      P0AEE2_A5555Lb_opcion = new String[] {""} ;
      P0AEE2_A5557Lb_LineaC = new short[1] ;
      A396EmprCod = "" ;
      A5555Lb_opcion = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.getcolorantesensayos__default(),
         new Object[] {
             new Object[] {
            P0AEE2_A396EmprCod, P0AEE2_A5532Lb_numero, P0AEE2_A5555Lb_opcion, P0AEE2_A5557Lb_LineaC
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17AuxColLin ;
   private short A5557Lb_LineaC ;
   private short Gx_err ;
   private int AV18lb_numero ;
   private int A5532Lb_numero ;
   private String AV8EmprCod ;
   private String AV19lb_opcion ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5555Lb_opcion ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AEE2_A396EmprCod ;
   private int[] P0AEE2_A5532Lb_numero ;
   private String[] P0AEE2_A5555Lb_opcion ;
   private short[] P0AEE2_A5557Lb_LineaC ;
}

final  class getcolorantesensayos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AEE2", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion, Lb_LineaC DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
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

