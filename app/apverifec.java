package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apverifec extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apverifec pgm = new apverifec (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      byte[] aP2 = new byte[] {0};
      String[] aP3 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (byte) GXutil.lval( args[2]);
         aP3[0] = (String) args[3];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3);
   }

   public apverifec( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apverifec.class ), "" );
   }

   public apverifec( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      apverifec.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      apverifec.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      apverifec.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      apverifec.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      apverifec.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      n2265BarExt = false ;
      /* Optimized UPDATE. */
      /* Using cursor P00W22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
      /* End optimized UPDATE. */
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pverifec.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apverifec.this.A396EmprCod;
      this.aP1[0] = apverifec.this.A129BarCod;
      this.aP2[0] = apverifec.this.A132BarCodReo;
      this.aP3[0] = apverifec.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "apverifec");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apverifec__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private boolean n2265BarExt ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class apverifec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00W22", "UPDATE TXPBARCAD SET BarExt=1  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

