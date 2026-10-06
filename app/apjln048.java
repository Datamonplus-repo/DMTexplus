package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln048 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln048 pgm = new apjln048 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0);
   }

   public apjln048( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln048.class ), "" );
   }

   public apjln048( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( )
   {
      apjln048.this.aP0 = new String[] {""};
      execute_int(aP0);
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      apjln048.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01LQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A763ProForCla = P01LQ2_A763ProForCla[0] ;
         A764ProForCod = P01LQ2_A764ProForCod[0] ;
         A767ProForLin = P01LQ2_A767ProForLin[0] ;
         if ( ( GXutil.strcmp(GXutil.substring( A763ProForCla, 1, 2), httpContext.getMessage( "TC", "")) == 0 ) || ( GXutil.strcmp(GXutil.substring( A763ProForCla, 1, 2), httpContext.getMessage( "AC", "")) == 0 ) )
         {
            AV8ProForCla = A763ProForCla ;
            AV9Opi = GXutil.substring( A763ProForCla, 1, 2) ;
            AV10Vi = GXutil.substring( A763ProForCla, 4, 4) ;
            AV11Vf = GXutil.substring( A763ProForCla, 9, 4) ;
            AV12Afa = GXutil.substring( A763ProForCla, 14, 3) ;
            AV13ProForClaF = AV9Opi + "0" + AV10Vi + " " + "0" + AV11Vf + AV12Afa ;
            A763ProForCla = AV13ProForClaF ;
            /* Using cursor P01LQ3 */
            pr_default.execute(1, new Object[] {A763ProForCla, A396EmprCod, A764ProForCod, Short.valueOf(A767ProForLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPROFO");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln048.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apjln048.this.A396EmprCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln048");
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
      P01LQ2_A396EmprCod = new String[] {""} ;
      P01LQ2_A763ProForCla = new String[] {""} ;
      P01LQ2_A764ProForCod = new String[] {""} ;
      P01LQ2_A767ProForLin = new short[1] ;
      A763ProForCla = "" ;
      A764ProForCod = "" ;
      AV8ProForCla = "" ;
      AV9Opi = "" ;
      AV10Vi = "" ;
      AV11Vf = "" ;
      AV12Afa = "" ;
      AV13ProForClaF = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln048__default(),
         new Object[] {
             new Object[] {
            P01LQ2_A396EmprCod, P01LQ2_A763ProForCla, P01LQ2_A764ProForCod, P01LQ2_A767ProForLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A767ProForLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A763ProForCla ;
   private String A764ProForCod ;
   private String AV8ProForCla ;
   private String AV9Opi ;
   private String AV10Vi ;
   private String AV11Vf ;
   private String AV12Afa ;
   private String AV13ProForClaF ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P01LQ2_A396EmprCod ;
   private String[] P01LQ2_A763ProForCla ;
   private String[] P01LQ2_A764ProForCod ;
   private short[] P01LQ2_A767ProForLin ;
}

final  class apjln048__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01LQ2", "SELECT EmprCod, ProForCla, ProForCod, ProForLin FROM TXPLPROFO WHERE EmprCod = ? ORDER BY EmprCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01LQ3", "UPDATE TXPLPROFO SET ProForCla=?  WHERE EmprCod = ? AND ProForCod = ? AND ProForLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPROFO")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

