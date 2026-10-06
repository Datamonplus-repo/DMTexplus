package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasproseleccionfasesprompt", "/app.tfasproseleccionfasesprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasproseleccionfasesprompt extends GXWebObjectStub
{
   public tfasproseleccionfasesprompt( )
   {
   }

   public tfasproseleccionfasesprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasproseleccionfasesprompt.class ));
   }

   public tfasproseleccionfasesprompt( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasproseleccionfasesprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasproseleccionfasesprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion FASES";
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

