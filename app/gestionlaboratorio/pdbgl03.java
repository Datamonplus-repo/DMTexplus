package app.gestionlaboratorio ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdbgl03 extends GXProcedure
{
   public pdbgl03( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdbgl03.class ), "" );
   }

   public pdbgl03( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pdbgl03.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      pdbgl03.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdbgl03.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03L52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8953Lb_FecR = P03L52_A8953Lb_FecR[0] ;
         A8954Lb_diasER = P03L52_A8954Lb_diasER[0] ;
         AV17Lb_DiasER = 0 ;
         AV16Lb_FecR = GXutil.nullDate() ;
         /* Using cursor P03L53 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A6461Lb_FecNoa1 = P03L53_A6461Lb_FecNoa1[0] ;
            A5563Lb_FechaR = P03L53_A5563Lb_FechaR[0] ;
            A5555Lb_opcion = P03L53_A5555Lb_opcion[0] ;
            if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A5563Lb_FechaR)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A6461Lb_FecNoa1)) )
            {
               AV16Lb_FecR = A5563Lb_FechaR ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A8953Lb_FecR = AV16Lb_FecR ;
         A8954Lb_diasER = 0 ;
         if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14Lb_FecE)) && ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16Lb_FecR)) )
         {
            A8954Lb_diasER = (int)(GXutil.ddiff(AV16Lb_FecR,AV14Lb_FecE)) ;
         }
         /* Using cursor P03L54 */
         pr_default.execute(2, new Object[] {A8953Lb_FecR, Integer.valueOf(A8954Lb_diasER), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdbgl03.this.A396EmprCod;
      this.aP1[0] = pdbgl03.this.A5532Lb_numero;
      Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.pdbgl03");
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
      P03L52_A396EmprCod = new String[] {""} ;
      P03L52_A5532Lb_numero = new int[1] ;
      P03L52_A8953Lb_FecR = new java.util.Date[] {GXutil.nullDate()} ;
      P03L52_A8954Lb_diasER = new int[1] ;
      A8953Lb_FecR = GXutil.nullDate() ;
      AV16Lb_FecR = GXutil.nullDate() ;
      P03L53_A396EmprCod = new String[] {""} ;
      P03L53_A5532Lb_numero = new int[1] ;
      P03L53_A6461Lb_FecNoa1 = new java.util.Date[] {GXutil.nullDate()} ;
      P03L53_A5563Lb_FechaR = new java.util.Date[] {GXutil.nullDate()} ;
      P03L53_A5555Lb_opcion = new String[] {""} ;
      A6461Lb_FecNoa1 = GXutil.nullDate() ;
      A5563Lb_FechaR = GXutil.nullDate() ;
      A5555Lb_opcion = "" ;
      AV14Lb_FecE = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.pdbgl03__default(),
         new Object[] {
             new Object[] {
            P03L52_A396EmprCod, P03L52_A5532Lb_numero, P03L52_A8953Lb_FecR, P03L52_A8954Lb_diasER
            }
            , new Object[] {
            P03L53_A396EmprCod, P03L53_A5532Lb_numero, P03L53_A6461Lb_FecNoa1, P03L53_A5563Lb_FechaR, P03L53_A5555Lb_opcion
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private int A8954Lb_diasER ;
   private int AV17Lb_DiasER ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A5555Lb_opcion ;
   private java.util.Date A8953Lb_FecR ;
   private java.util.Date AV16Lb_FecR ;
   private java.util.Date A6461Lb_FecNoa1 ;
   private java.util.Date A5563Lb_FechaR ;
   private java.util.Date AV14Lb_FecE ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P03L52_A396EmprCod ;
   private int[] P03L52_A5532Lb_numero ;
   private java.util.Date[] P03L52_A8953Lb_FecR ;
   private int[] P03L52_A8954Lb_diasER ;
   private String[] P03L53_A396EmprCod ;
   private int[] P03L53_A5532Lb_numero ;
   private java.util.Date[] P03L53_A6461Lb_FecNoa1 ;
   private java.util.Date[] P03L53_A5563Lb_FechaR ;
   private String[] P03L53_A5555Lb_opcion ;
}

final  class pdbgl03__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03L52", "SELECT EmprCod, Lb_numero, Lb_FecR, Lb_diasER FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03L53", "SELECT EmprCod, Lb_numero, Lb_FecNoa1, Lb_FechaR, Lb_opcion FROM TXPENS002 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero, Lb_opcion ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03L54", "UPDATE TXPENS001 SET Lb_FecR=?, Lb_diasER=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

