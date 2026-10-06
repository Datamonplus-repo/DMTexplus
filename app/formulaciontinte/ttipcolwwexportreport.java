package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.ttipcolwwexportreport", "/app.formulaciontinte.ttipcolwwexportreport"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcolwwexportreport extends GXWebObjectStub
{
   public ttipcolwwexportreport( )
   {
   }

   public ttipcolwwexportreport( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcolwwexportreport.class ));
   }

   public ttipcolwwexportreport( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcolwwexportreport_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcolwwexportreport_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Tipo Colorante";
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

