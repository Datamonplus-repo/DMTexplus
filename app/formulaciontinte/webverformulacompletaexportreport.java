package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webverformulacompletaexportreport", "/app.formulaciontinte.webverformulacompletaexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webverformulacompletaexportreport extends GXWebObjectStub
{
   public webverformulacompletaexportreport( )
   {
   }

   public webverformulacompletaexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webverformulacompletaexportreport.class ));
   }

   public webverformulacompletaexportreport( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webverformulacompletaexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webverformulacompletaexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Simulacion Formula";
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

