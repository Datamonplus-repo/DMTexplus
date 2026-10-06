package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacforg extends GXProcedure
{
   public pmacforg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacforg.class ), "" );
   }

   public pmacforg( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      pmacforg.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pmacforg.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacforg.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pmacforg.this.AV8MacProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Delete Procesos....", "") );
      /* Optimized DELETE. */
      /* Using cursor P03532 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
      /* End optimized DELETE. */
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pmacforg");
      System.out.println( httpContext.getMessage( "Creo Procesos....", "") );
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV8MacProCod ;
      GXv_int3[0] = A5532Lb_numero ;
      GXv_int4[0] = AV11Lb_UltlPq ;
      new app.formulaciontinte.pens051(remoteHandle, context).execute( GXv_char1, GXv_char2, GXv_int3, GXv_int4) ;
      pmacforg.this.A396EmprCod = GXv_char1[0] ;
      pmacforg.this.AV8MacProCod = GXv_char2[0] ;
      pmacforg.this.A5532Lb_numero = GXv_int3[0] ;
      pmacforg.this.AV11Lb_UltlPq = GXv_int4[0] ;
      System.out.println( httpContext.getMessage( "Actualizo Formula....", "") );
      n1514MacProCod = false ;
      /* Optimized UPDATE. */
      /* Using cursor P03533 */
      pr_default.execute(1, new Object[] {Boolean.valueOf(n1514MacProCod), AV8MacProCod, Short.valueOf(AV11Lb_UltlPq), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacforg.this.A396EmprCod;
      this.aP1[0] = pmacforg.this.A5532Lb_numero;
      this.aP2[0] = pmacforg.this.AV8MacProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pmacforg");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char1 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int4 = new short[1] ;
      A1514MacProCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforg__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforg__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforg__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pmacforg__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Lb_UltlPq ;
   private short GXv_int4[] ;
   private short A5550Lb_UltlPq ;
   private short Gx_err ;
   private int A5532Lb_numero ;
   private int GXv_int3[] ;
   private String A396EmprCod ;
   private String AV8MacProCod ;
   private String GXv_char1[] ;
   private String GXv_char2[] ;
   private String A1514MacProCod ;
   private boolean n1514MacProCod ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class pmacforg__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class pmacforg__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class pmacforg__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class pmacforg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P03532", "DELETE FROM TXPENS000  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS000")
         ,new UpdateCursor("P03533", "UPDATE TXPENS001 SET MacProCod=?, Lb_UltlPq=?  WHERE EmprCod = ? and Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

