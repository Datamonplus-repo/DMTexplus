package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclihdr extends GXProcedure
{
   public pclihdr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclihdr.class ), "" );
   }

   public pclihdr( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 )
   {
      pclihdr.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 )
   {
      pclihdr.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pclihdr.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pclihdr.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pclihdr.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pclihdr.this.AV12CliDes = aP4[0];
      this.aP4 = aP4;
      pclihdr.this.AV14FlagCliHdr = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Salayet = (byte)(0) ;
      GXv_int1[0] = AV15Salayet ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALAYE", ""), GXv_int1) ;
      pclihdr.this.AV15Salayet = GXv_int1[0] ;
      AV16PLinea = (byte)(0) ;
      GXv_int1[0] = AV16PLinea ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLINEA", ""), GXv_int1) ;
      pclihdr.this.AV16PLinea = GXv_int1[0] ;
      AV14FlagCliHdr = (byte)(0) ;
      /* Using cursor P012B2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2311BarCliDes = P012B2_A2311BarCliDes[0] ;
         if ( A2311BarCliDes > 0 )
         {
            if ( AV12CliDes != A2311BarCliDes )
            {
               AV14FlagCliHdr = (byte)(1) ;
               if ( ( AV15Salayet == 1 ) || ( AV16PLinea == 1 ) )
               {
                  AV12CliDes = A2311BarCliDes ;
               }
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pclihdr.this.A396EmprCod;
      this.aP1[0] = pclihdr.this.A129BarCod;
      this.aP2[0] = pclihdr.this.A132BarCodReo;
      this.aP3[0] = pclihdr.this.A130BarCodPar;
      this.aP4[0] = pclihdr.this.AV12CliDes;
      this.aP5[0] = pclihdr.this.AV14FlagCliHdr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      scmdbuf = "" ;
      P012B2_A396EmprCod = new String[] {""} ;
      P012B2_A129BarCod = new int[1] ;
      P012B2_A132BarCodReo = new byte[1] ;
      P012B2_A130BarCodPar = new String[] {""} ;
      P012B2_A2311BarCliDes = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclihdr__default(),
         new Object[] {
             new Object[] {
            P012B2_A396EmprCod, P012B2_A129BarCod, P012B2_A132BarCodReo, P012B2_A130BarCodPar, P012B2_A2311BarCliDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV14FlagCliHdr ;
   private byte AV15Salayet ;
   private byte AV16PLinea ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV12CliDes ;
   private int A2311BarCliDes ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P012B2_A396EmprCod ;
   private int[] P012B2_A129BarCod ;
   private byte[] P012B2_A132BarCodReo ;
   private String[] P012B2_A130BarCodPar ;
   private int[] P012B2_A2311BarCliDes ;
}

final  class pclihdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P012B2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarCliDes FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

