package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcopint extends GXProcedure
{
   public pcopint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcopint.class ), "" );
   }

   public pcopint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 )
   {
      pcopint.this.aP3 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             byte[] aP3 )
   {
      pcopint.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      pcopint.this.AV16CliCod = aP1[0];
      this.aP1 = aP1;
      pcopint.this.AV17ArtCod = aP2[0];
      this.aP2 = aP2;
      pcopint.this.AV18TipColCod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      System.out.println( httpContext.getMessage( "Creando tabla PRETIN", "") );
      /* Using cursor P00172 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = P00172_A583IntCod[0] ;
         A396EmprCod = P00172_A396EmprCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPPRETIN

         */
         W396EmprCod = A396EmprCod ;
         W583IntCod = A583IntCod ;
         A396EmprCod = AV15EmprCod ;
         A252CliCod = AV16CliCod ;
         A65ArtCod = AV17ArtCod ;
         A831TipColCod = AV18TipColCod ;
         A585IntPreDef = httpContext.getMessage( "N", "") ;
         n585IntPreDef = false ;
         /* Using cursor P00173 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A583IntCod), Boolean.valueOf(n585IntPreDef), A585IntPreDef});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRETIN");
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
         A583IntCod = W583IntCod ;
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      System.out.println( httpContext.getMessage( "Fin tabla PRETIN", "") );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcopint.this.AV15EmprCod;
      this.aP1[0] = pcopint.this.AV16CliCod;
      this.aP2[0] = pcopint.this.AV17ArtCod;
      this.aP3[0] = pcopint.this.AV18TipColCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcopint");
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
      P00172_A583IntCod = new byte[1] ;
      P00172_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      A65ArtCod = "" ;
      A585IntPreDef = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcopint__default(),
         new Object[] {
             new Object[] {
            P00172_A583IntCod, P00172_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV18TipColCod ;
   private byte A583IntCod ;
   private byte W583IntCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int GX_INS84 ;
   private int A252CliCod ;
   private String AV15EmprCod ;
   private String AV17ArtCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String A65ArtCod ;
   private String A585IntPreDef ;
   private String Gx_emsg ;
   private boolean n585IntPreDef ;
   private byte[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00172_A583IntCod ;
   private String[] P00172_A396EmprCod ;
}

final  class pcopint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00172", "SELECT IntCod, EmprCod FROM TXPINTENS ORDER BY EmprCod, IntCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00173", "INSERT INTO TXPPRETIN(EmprCod, CliCod, ArtCod, TipColCod, IntCod, IntPreDef, IntPreKgm, IntPreMtr, PreFacCod) VALUES(?, ?, ?, ?, ?, ?, 0, 0, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPRETIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 1);
               }
               return;
      }
   }

}

