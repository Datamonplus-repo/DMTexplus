package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclimat extends GXProcedure
{
   public pclimat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclimat.class ), "" );
   }

   public pclimat( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      pclimat.this.aP1 = new int[] {0};
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
      pclimat.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclimat.this.AV8clicod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P05UX2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A626MatCod = P05UX2_A626MatCod[0] ;
         A627MatDsc = P05UX2_A627MatDsc[0] ;
         n627MatDsc = P05UX2_n627MatDsc[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPCLIMAT

         */
         W396EmprCod = A396EmprCod ;
         A252CliCod = AV8clicod ;
         A13240CliMatCod = A626MatCod ;
         A13238CliMatDsc = A627MatDsc ;
         n13238CliMatDsc = false ;
         A13239MatNumCol = 0 ;
         n13239MatNumCol = false ;
         /* Using cursor P05UX3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A13240CliMatCod), Boolean.valueOf(n13238CliMatDsc), A13238CliMatDsc, Boolean.valueOf(n13239MatNumCol), Integer.valueOf(A13239MatNumCol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIMAT");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclimat.this.A396EmprCod;
      this.aP1[0] = pclimat.this.AV8clicod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pclimat");
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
      P05UX2_A396EmprCod = new String[] {""} ;
      P05UX2_A626MatCod = new short[1] ;
      P05UX2_A627MatDsc = new String[] {""} ;
      P05UX2_n627MatDsc = new boolean[] {false} ;
      A627MatDsc = "" ;
      W396EmprCod = "" ;
      A13238CliMatDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclimat__default(),
         new Object[] {
             new Object[] {
            P05UX2_A396EmprCod, P05UX2_A626MatCod, P05UX2_A627MatDsc, P05UX2_n627MatDsc
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A626MatCod ;
   private short A13240CliMatCod ;
   private short Gx_err ;
   private int AV8clicod ;
   private int GX_INS1815 ;
   private int A252CliCod ;
   private int A13239MatNumCol ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A627MatDsc ;
   private String W396EmprCod ;
   private String A13238CliMatDsc ;
   private String Gx_emsg ;
   private boolean n627MatDsc ;
   private boolean n13238CliMatDsc ;
   private boolean n13239MatNumCol ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P05UX2_A396EmprCod ;
   private short[] P05UX2_A626MatCod ;
   private String[] P05UX2_A627MatDsc ;
   private boolean[] P05UX2_n627MatDsc ;
}

final  class pclimat__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05UX2", "SELECT EmprCod, MatCod, MatDsc FROM TXPMATICE WHERE EmprCod = ? ORDER BY EmprCod, MatCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05UX3", "INSERT INTO TXPCLIMAT(EmprCod, CliCod, CliMatCod, CliMatDsc, MatNumCol) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCLIMAT")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 30);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[6]).intValue());
               }
               return;
      }
   }

}

