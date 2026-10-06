package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.verprocesoquimico", "/app.verprocesoquimico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class verprocesoquimico extends GXWebObjectStub
{
   public verprocesoquimico( )
   {
   }

   public verprocesoquimico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( verprocesoquimico.class ));
   }

   public verprocesoquimico( int remoteHandle ,
                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new verprocesoquimico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new verprocesoquimico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LPROFO_TRN";
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

