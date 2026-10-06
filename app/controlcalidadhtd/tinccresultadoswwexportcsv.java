package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tinccresultadoswwexportcsv", "/app.controlcalidadhtd.tinccresultadoswwexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinccresultadoswwexportcsv extends GXWebObjectStub
{
   public tinccresultadoswwexportcsv( )
   {
   }

   public tinccresultadoswwexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinccresultadoswwexportcsv.class ));
   }

   public tinccresultadoswwexportcsv( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinccresultadoswwexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinccresultadoswwexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINCCResultados WWExport CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

