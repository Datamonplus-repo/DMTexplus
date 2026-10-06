package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pformuc extends GXProcedure
{
   public pformuc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pformuc.class ), "" );
   }

   public pformuc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     String[] aP2 ,
                                     short[] aP3 ,
                                     byte[] aP4 )
   {
      pformuc.this.aP5 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 ,
                        byte[] aP4 ,
                        java.util.Date[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 ,
                             byte[] aP4 ,
                             java.util.Date[] aP5 )
   {
      pformuc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pformuc.this.AV8Fornumcol = aP1[0];
      this.aP1 = aP1;
      pformuc.this.AV9ForOpcCli = aP2[0];
      this.aP2 = aP2;
      pformuc.this.AV10CodSol = aP3[0];
      this.aP3 = aP3;
      pformuc.this.AV11ForCon = aP4[0];
      this.aP4 = aP4;
      pformuc.this.AV12ForFecapr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Actualizando colores.....", "") );
      n3558ForFecApr = false ;
      n3560ForOpcCli = false ;
      n3316CodSol = false ;
      /* Optimized UPDATE. */
      /* Using cursor P02GT2 */
      pr_default.execute(0, new Object[] {Boolean.valueOf(n3558ForFecApr), AV12ForFecapr, Boolean.valueOf(n3560ForOpcCli), AV9ForOpcCli, Byte.valueOf(AV11ForCon), Boolean.valueOf(n3316CodSol), Short.valueOf(AV10CodSol), A396EmprCod, Integer.valueOf(AV8Fornumcol)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
      /* End optimized UPDATE. */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pformuc.this.A396EmprCod;
      this.aP1[0] = pformuc.this.AV8Fornumcol;
      this.aP2[0] = pformuc.this.AV9ForOpcCli;
      this.aP3[0] = pformuc.this.AV10CodSol;
      this.aP4[0] = pformuc.this.AV11ForCon;
      this.aP5[0] = pformuc.this.AV12ForFecapr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pformuc");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A3558ForFecApr = GXutil.nullDate() ;
      A3560ForOpcCli = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pformuc__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11ForCon ;
   private byte A484ForCon ;
   private short AV10CodSol ;
   private short A3316CodSol ;
   private short Gx_err ;
   private int AV8Fornumcol ;
   private String A396EmprCod ;
   private String AV9ForOpcCli ;
   private String A3560ForOpcCli ;
   private java.util.Date AV12ForFecapr ;
   private java.util.Date A3558ForFecApr ;
   private boolean n3558ForFecApr ;
   private boolean n3560ForOpcCli ;
   private boolean n3316CodSol ;
   private java.util.Date[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private short[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
}

final  class pformuc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02GT2", "UPDATE TXPCFORMU SET ForFecApr=?, ForOpcCli=?, ForCon=?, CodSol=?  WHERE EmprCod = ? and ForNumCol = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               stmt.setByte(3, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               return;
      }
   }

}

