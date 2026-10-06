package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class colorbloqueado extends GXProcedure
{
   public colorbloqueado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorbloqueado.class ), "" );
   }

   public colorbloqueado( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 )
   {
      colorbloqueado.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        int aP4 ,
                        byte aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             int aP4 ,
                             byte aP5 ,
                             String[] aP6 )
   {
      colorbloqueado.this.AV9EmprCod = aP0;
      colorbloqueado.this.AV10CliCod = aP1;
      colorbloqueado.this.AV11ForSer = aP2;
      colorbloqueado.this.AV12ForColNom = aP3;
      colorbloqueado.this.AV13ForColNum = aP4;
      colorbloqueado.this.AV14TipColCod = aP5;
      colorbloqueado.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8forblo = "N" ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(AV14TipColCod) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           AV9EmprCod ,
                                           Integer.valueOf(AV10CliCod) ,
                                           AV11ForSer ,
                                           AV12ForColNom ,
                                           Integer.valueOf(AV13ForColNum) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      /* Using cursor P0AQ92 */
      pr_default.execute(0, new Object[] {AV9EmprCod, Integer.valueOf(AV10CliCod), AV11ForSer, AV12ForColNom, Integer.valueOf(AV13ForColNum), Byte.valueOf(AV14TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P0AQ92_A831TipColCod[0] ;
         A483ForColNum = P0AQ92_A483ForColNum[0] ;
         A482ForColNom = P0AQ92_A482ForColNom[0] ;
         A494ForSer = P0AQ92_A494ForSer[0] ;
         A252CliCod = P0AQ92_A252CliCod[0] ;
         A396EmprCod = P0AQ92_A396EmprCod[0] ;
         A7781ForBlo = P0AQ92_A7781ForBlo[0] ;
         n7781ForBlo = P0AQ92_n7781ForBlo[0] ;
         AV8forblo = A7781ForBlo ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP6[0] = colorbloqueado.this.AV8forblo;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8forblo = "" ;
      scmdbuf = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P0AQ92_A831TipColCod = new byte[1] ;
      P0AQ92_A483ForColNum = new int[1] ;
      P0AQ92_A482ForColNom = new String[] {""} ;
      P0AQ92_A494ForSer = new String[] {""} ;
      P0AQ92_A252CliCod = new int[1] ;
      P0AQ92_A396EmprCod = new String[] {""} ;
      P0AQ92_A7781ForBlo = new String[] {""} ;
      P0AQ92_n7781ForBlo = new boolean[] {false} ;
      A7781ForBlo = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.colorbloqueado__default(),
         new Object[] {
             new Object[] {
            P0AQ92_A831TipColCod, P0AQ92_A483ForColNum, P0AQ92_A482ForColNom, P0AQ92_A494ForSer, P0AQ92_A252CliCod, P0AQ92_A396EmprCod, P0AQ92_A7781ForBlo, P0AQ92_n7781ForBlo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TipColCod ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV10CliCod ;
   private int AV13ForColNum ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private String AV9EmprCod ;
   private String AV11ForSer ;
   private String AV12ForColNom ;
   private String AV8forblo ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A7781ForBlo ;
   private boolean n7781ForBlo ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private byte[] P0AQ92_A831TipColCod ;
   private int[] P0AQ92_A483ForColNum ;
   private String[] P0AQ92_A482ForColNom ;
   private String[] P0AQ92_A494ForSer ;
   private int[] P0AQ92_A252CliCod ;
   private String[] P0AQ92_A396EmprCod ;
   private String[] P0AQ92_A7781ForBlo ;
   private boolean[] P0AQ92_n7781ForBlo ;
}

final  class colorbloqueado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AQ92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV14TipColCod ,
                                          byte A831TipColCod ,
                                          String AV9EmprCod ,
                                          int AV10CliCod ,
                                          String AV11ForSer ,
                                          String AV12ForColNom ,
                                          int AV13ForColNum ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int1 = new byte[6];
      Object[] GXv_Object2 = new Object[2];
      scmdbuf = "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod, ForBlo FROM TXPCFORMU" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ?)");
      if ( ! (0==AV14TipColCod) )
      {
         addWhere(sWhereString, "(TipColCod = ?)");
      }
      else
      {
         GXv_int1[5] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum" ;
      GXv_Object2[0] = scmdbuf ;
      GXv_Object2[1] = GXv_int1 ;
      return GXv_Object2 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0AQ92(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQ92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[10]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               return;
      }
   }

}

