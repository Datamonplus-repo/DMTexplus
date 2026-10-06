package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdye003 extends GXProcedure
{
   public pdye003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdye003.class ), "" );
   }

   public pdye003( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pdye003.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pdye003.this.AV56EmprCod = aP0[0];
      this.aP0 = aP0;
      pdye003.this.AV47Barcod = aP1[0];
      this.aP1 = aP1;
      pdye003.this.AV48BarcodReo = aP2[0];
      this.aP2 = aP2;
      pdye003.this.AV49BarcodPar = aP3[0];
      this.aP3 = aP3;
      pdye003.this.AV50RecLinMaq = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV54UsurCod = " " ;
      AV55Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV56EmprCod ;
      GXv_char2[0] = AV53EmprNom ;
      GXv_char3[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV55Station, GXv_char1, GXv_char2, GXv_char3) ;
      pdye003.this.AV56EmprCod = GXv_char1[0] ;
      pdye003.this.AV53EmprNom = GXv_char2[0] ;
      pdye003.this.AV54UsurCod = GXv_char3[0] ;
      GXt_int4 = AV68Tintatex ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV56EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int5) ;
      pdye003.this.GXt_int4 = GXv_int5[0] ;
      AV68Tintatex = GXt_int4 ;
      GXt_int4 = AV78Etm ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( AV56EmprCod, httpContext.getMessage( "ETM", ""), GXv_int5) ;
      pdye003.this.GXt_int4 = GXv_int5[0] ;
      AV78Etm = GXt_int4 ;
      GXt_int6 = AV86Nespera ;
      GXv_char3[0] = AV56EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "ORGNRG", "") ;
      GXv_int7[0] = GXt_int6 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int7) ;
      pdye003.this.AV56EmprCod = GXv_char3[0] ;
      pdye003.this.GXt_int6 = GXv_int7[0] ;
      AV86Nespera = GXt_int6 ;
      AV86Nespera = ((AV86Nespera==0) ? 5000 : AV86Nespera) ;
      AV52Nregtos = 0 ;
      AV79Oklectura = (byte)(0) ;
      /* Using cursor P058L2 */
      pr_default.execute(0, new Object[] {AV56EmprCod, Integer.valueOf(AV47Barcod), Byte.valueOf(AV48BarcodReo), AV49BarcodPar, Short.valueOf(AV50RecLinMaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P058L2_A2804RecLinMaq[0] ;
         A130BarCodPar = P058L2_A130BarCodPar[0] ;
         A132BarCodReo = P058L2_A132BarCodReo[0] ;
         A129BarCod = P058L2_A129BarCod[0] ;
         A396EmprCod = P058L2_A396EmprCod[0] ;
         A5109RecNumInt = P058L2_A5109RecNumInt[0] ;
         AV76DyelotRecipeNo = ((AV78Etm==1)&&(A5109RecNumInt>0) ? GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)) : GXutil.trim( GXutil.str( A129BarCod, 8, 0))) ;
         AV73RecipeNo = ((AV68Tintatex==1) ? GXutil.trim( GXutil.str( A129BarCod, 8, 0))+GXutil.trim( GXutil.str( A132BarCodReo, 1, 0))+A130BarCodPar : AV76DyelotRecipeNo) ;
         AV74Dyelot = ((AV68Tintatex==1) ? GXutil.trim( GXutil.str( A129BarCod, 8, 0))+GXutil.trim( GXutil.str( A132BarCodReo, 1, 0))+A130BarCodPar : AV76DyelotRecipeNo) ;
         AV75ReDye = ((AV78Etm==1)&&(A5109RecNumInt>0) ? 0 : A132BarCodReo) ;
         AV79Oklectura = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV79Oklectura == 1 )
      {
         GXv_char3[0] = AV56EmprCod ;
         GXv_int7[0] = AV47Barcod ;
         GXv_int5[0] = AV48BarcodReo ;
         GXv_char2[0] = AV49BarcodPar ;
         GXv_int8[0] = AV50RecLinMaq ;
         GXv_char1[0] = AV73RecipeNo ;
         GXv_char9[0] = AV74Dyelot ;
         GXv_int10[0] = AV75ReDye ;
         GXv_int11[0] = AV82Ok30 ;
         new app.pdye300(remoteHandle, context).execute( GXv_char3, GXv_int7, GXv_int5, GXv_char2, GXv_int8, GXv_char1, GXv_char9, GXv_int10, GXv_int11) ;
         pdye003.this.AV56EmprCod = GXv_char3[0] ;
         pdye003.this.AV47Barcod = GXv_int7[0] ;
         pdye003.this.AV48BarcodReo = GXv_int5[0] ;
         pdye003.this.AV49BarcodPar = GXv_char2[0] ;
         pdye003.this.AV50RecLinMaq = GXv_int8[0] ;
         pdye003.this.AV73RecipeNo = GXv_char1[0] ;
         pdye003.this.AV74Dyelot = GXv_char9[0] ;
         pdye003.this.AV75ReDye = GXv_int10[0] ;
         pdye003.this.AV82Ok30 = GXv_int11[0] ;
         if ( AV82Ok30 == 1 )
         {
            AV80OkStatus = (byte)(0) ;
            AV81i = 0 ;
            while ( AV80OkStatus == 0 )
            {
               if ( AV81i > AV86Nespera )
               {
                  AV85inc_obs = httpContext.getMessage( "Esperando cambio en DEYLOTS.ImportState a 40, pero no llego...", "") + GXutil.newLine( ) ;
                  AV85inc_obs += httpContext.getMessage( "Salgo del proceso. Valor contador ORGNRG ", "") + GXutil.str( AV86Nespera, 8, 0) + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( AV56EmprCod, AV90Pgmname, AV54UsurCod, AV55Station, AV85inc_obs, AV47Barcod, AV48BarcodReo, AV49BarcodPar) ;
                  if (true) break;
               }
               /* Using cursor P058L3 */
               pr_default.execute(1, new Object[] {AV74Dyelot, Integer.valueOf(AV75ReDye)});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A12312ImportStat = P058L3_A12312ImportStat[0] ;
                  A12314ReDye = P058L3_A12314ReDye[0] ;
                  A12313Dyelot = P058L3_A12313Dyelot[0] ;
                  AV51Control = httpContext.getMessage( "Cambio ImportState tabla DEYLOTS ", "") + GXutil.trim( AV74Dyelot) + "-" + GXutil.str( AV75ReDye, 5, 0) ;
                  System.out.println( AV51Control );
                  AV80OkStatus = (byte)(1) ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
               AV81i = (int)(AV81i+1) ;
               AV51Control = httpContext.getMessage( "Procesando..Control Importstate=40,", "") + GXutil.str( AV81i, 6, 0) ;
               System.out.println( AV51Control );
            }
            if ( AV80OkStatus == 1 )
            {
               AV51Control = httpContext.getMessage( "Campo ImportState=40 tabla DEYLOTS, procede a eliminar ", "") + GXutil.trim( AV74Dyelot) + "-" + GXutil.str( AV75ReDye, 5, 0) ;
               System.out.println( AV51Control );
               GXv_char9[0] = AV56EmprCod ;
               GXv_int10[0] = AV47Barcod ;
               GXv_int11[0] = AV48BarcodReo ;
               GXv_char3[0] = AV49BarcodPar ;
               GXv_int8[0] = AV50RecLinMaq ;
               GXv_char2[0] = AV73RecipeNo ;
               GXv_char1[0] = AV74Dyelot ;
               GXv_int7[0] = AV75ReDye ;
               new app.pdye301(remoteHandle, context).execute( GXv_char9, GXv_int10, GXv_int11, GXv_char3, GXv_int8, GXv_char2, GXv_char1, GXv_int7) ;
               pdye003.this.AV56EmprCod = GXv_char9[0] ;
               pdye003.this.AV47Barcod = GXv_int10[0] ;
               pdye003.this.AV48BarcodReo = GXv_int11[0] ;
               pdye003.this.AV49BarcodPar = GXv_char3[0] ;
               pdye003.this.AV50RecLinMaq = GXv_int8[0] ;
               pdye003.this.AV73RecipeNo = GXv_char2[0] ;
               pdye003.this.AV74Dyelot = GXv_char1[0] ;
               pdye003.this.AV75ReDye = GXv_int7[0] ;
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdye003.this.AV56EmprCod;
      this.aP1[0] = pdye003.this.AV47Barcod;
      this.aP2[0] = pdye003.this.AV48BarcodReo;
      this.aP3[0] = pdye003.this.AV49BarcodPar;
      this.aP4[0] = pdye003.this.AV50RecLinMaq;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV54UsurCod = "" ;
      AV55Station = "" ;
      AV53EmprNom = "" ;
      scmdbuf = "" ;
      P058L2_A2804RecLinMaq = new short[1] ;
      P058L2_A130BarCodPar = new String[] {""} ;
      P058L2_A132BarCodReo = new byte[1] ;
      P058L2_A129BarCod = new int[1] ;
      P058L2_A396EmprCod = new String[] {""} ;
      P058L2_A5109RecNumInt = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      AV76DyelotRecipeNo = "" ;
      AV73RecipeNo = "" ;
      AV74Dyelot = "" ;
      GXv_int5 = new byte[1] ;
      AV85inc_obs = "" ;
      AV90Pgmname = "" ;
      P058L3_A12312ImportStat = new int[1] ;
      P058L3_A12314ReDye = new int[1] ;
      P058L3_A12313Dyelot = new String[] {""} ;
      A12313Dyelot = "" ;
      AV51Control = "" ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdye003__default(),
         new Object[] {
             new Object[] {
            P058L2_A2804RecLinMaq, P058L2_A130BarCodPar, P058L2_A132BarCodReo, P058L2_A129BarCod, P058L2_A396EmprCod, P058L2_A5109RecNumInt
            }
            , new Object[] {
            P058L3_A12312ImportStat, P058L3_A12314ReDye, P058L3_A12313Dyelot
            }
         }
      );
      AV90Pgmname = "PDYE003" ;
      /* GeneXus formulas. */
      AV90Pgmname = "PDYE003" ;
      Gx_err = (short)(0) ;
   }

   private byte AV48BarcodReo ;
   private byte AV68Tintatex ;
   private byte AV78Etm ;
   private byte GXt_int4 ;
   private byte AV79Oklectura ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private byte AV82Ok30 ;
   private byte AV80OkStatus ;
   private byte GXv_int11[] ;
   private short AV50RecLinMaq ;
   private short A2804RecLinMaq ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int AV47Barcod ;
   private int AV86Nespera ;
   private int GXt_int6 ;
   private int AV52Nregtos ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private int AV75ReDye ;
   private int AV81i ;
   private int A12312ImportStat ;
   private int A12314ReDye ;
   private int GXv_int10[] ;
   private int GXv_int7[] ;
   private String AV56EmprCod ;
   private String AV49BarcodPar ;
   private String AV54UsurCod ;
   private String AV55Station ;
   private String AV53EmprNom ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String AV76DyelotRecipeNo ;
   private String AV90Pgmname ;
   private String GXv_char9[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV73RecipeNo ;
   private String AV74Dyelot ;
   private String AV85inc_obs ;
   private String A12313Dyelot ;
   private String AV51Control ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private short[] P058L2_A2804RecLinMaq ;
   private String[] P058L2_A130BarCodPar ;
   private byte[] P058L2_A132BarCodReo ;
   private int[] P058L2_A129BarCod ;
   private String[] P058L2_A396EmprCod ;
   private int[] P058L2_A5109RecNumInt ;
   private int[] P058L3_A12312ImportStat ;
   private int[] P058L3_A12314ReDye ;
   private String[] P058L3_A12313Dyelot ;
}

final  class pdye003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P058L2", "SELECT RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, RecNumInt FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P058L3", "SELECT ImportStat, ReDye, Dyelot FROM TXPDYE001 WHERE (Dyelot = ? and ReDye = ?) AND (ImportStat = 40) ORDER BY Dyelot, ReDye ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

