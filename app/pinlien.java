package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinlien extends GXProcedure
{
   public pinlien( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinlien.class ), "" );
   }

   public pinlien( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pinlien.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      pinlien.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pinlien.this.AV18Lb_numero = aP1[0];
      this.aP1 = aP1;
      pinlien.this.AV20Lb_opcion = aP2[0];
      this.aP2 = aP2;
      pinlien.this.AV19Lb_Linea = aP3[0];
      this.aP3 = aP3;
      pinlien.this.AV21Tipo = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02BB2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV18Lb_numero), AV20Lb_opcion});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5555Lb_opcion = P02BB2_A5555Lb_opcion[0] ;
         A5532Lb_numero = P02BB2_A5532Lb_numero[0] ;
         A396EmprCod = P02BB2_A396EmprCod[0] ;
         A5556Lb_UltLC = P02BB2_A5556Lb_UltLC[0] ;
         A5559Lb_UltlP = P02BB2_A5559Lb_UltlP[0] ;
         if ( GXutil.strcmp(AV21Tipo, httpContext.getMessage( "C", "")) == 0 )
         {
            if ( ( A5556Lb_UltLC + 10 ) <= 9990 )
            {
               A5556Lb_UltLC = (short)(A5556Lb_UltLC+10) ;
               AV19Lb_Linea = A5556Lb_UltLC ;
            }
         }
         else
         {
            if ( ( A5559Lb_UltlP + 10 ) <= 9990 )
            {
               A5559Lb_UltlP = (short)(A5559Lb_UltlP+10) ;
               AV19Lb_Linea = A5559Lb_UltlP ;
            }
         }
         /* Using cursor P02BB3 */
         pr_default.execute(1, new Object[] {Short.valueOf(A5556Lb_UltLC), Short.valueOf(A5559Lb_UltlP), A396EmprCod, Integer.valueOf(A5532Lb_numero), A5555Lb_opcion});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS002");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinlien.this.AV15EmprCod;
      this.aP1[0] = pinlien.this.AV18Lb_numero;
      this.aP2[0] = pinlien.this.AV20Lb_opcion;
      this.aP3[0] = pinlien.this.AV19Lb_Linea;
      this.aP4[0] = pinlien.this.AV21Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinlien");
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
      P02BB2_A5555Lb_opcion = new String[] {""} ;
      P02BB2_A5532Lb_numero = new int[1] ;
      P02BB2_A396EmprCod = new String[] {""} ;
      P02BB2_A5556Lb_UltLC = new short[1] ;
      P02BB2_A5559Lb_UltlP = new short[1] ;
      A5555Lb_opcion = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinlien__default(),
         new Object[] {
             new Object[] {
            P02BB2_A5555Lb_opcion, P02BB2_A5532Lb_numero, P02BB2_A396EmprCod, P02BB2_A5556Lb_UltLC, P02BB2_A5559Lb_UltlP
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV19Lb_Linea ;
   private short A5556Lb_UltLC ;
   private short A5559Lb_UltlP ;
   private short Gx_err ;
   private int AV18Lb_numero ;
   private int A5532Lb_numero ;
   private String AV15EmprCod ;
   private String AV20Lb_opcion ;
   private String AV21Tipo ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private String A396EmprCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P02BB2_A5555Lb_opcion ;
   private int[] P02BB2_A5532Lb_numero ;
   private String[] P02BB2_A396EmprCod ;
   private short[] P02BB2_A5556Lb_UltLC ;
   private short[] P02BB2_A5559Lb_UltlP ;
}

final  class pinlien__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02BB2", "SELECT Lb_opcion, Lb_numero, EmprCod, Lb_UltLC, Lb_UltlP FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? and Lb_opcion = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P02BB3", "UPDATE TXPENS002 SET Lb_UltLC=?, Lb_UltlP=?  WHERE EmprCod = ? AND Lb_numero = ? AND Lb_opcion = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS002")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
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
            case 1 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

