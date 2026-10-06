package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webinslineaprocesoquimico", "/app.webinslineaprocesoquimico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webinslineaprocesoquimico extends GXWebObjectStub
{
   public webinslineaprocesoquimico( )
   {
   }

   public webinslineaprocesoquimico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webinslineaprocesoquimico.class ));
   }

   public webinslineaprocesoquimico( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webinslineaprocesoquimico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webinslineaprocesoquimico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Web Ins Linea Proceso Quimico";
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

