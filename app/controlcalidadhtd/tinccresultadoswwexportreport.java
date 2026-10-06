package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tinccresultadoswwexportreport", "/app.controlcalidadhtd.tinccresultadoswwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinccresultadoswwexportreport extends GXWebObjectStub
{
   public tinccresultadoswwexportreport( )
   {
   }

   public tinccresultadoswwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinccresultadoswwexportreport.class ));
   }

   public tinccresultadoswwexportreport( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinccresultadoswwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinccresultadoswwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINCCResultados WWExport Report";
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

