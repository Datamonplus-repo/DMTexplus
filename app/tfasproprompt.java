package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasproprompt", "/app.tfasproprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasproprompt extends GXWebObjectStub
{
   public tfasproprompt( )
   {
   }

   public tfasproprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasproprompt.class ));
   }

   public tfasproprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasproprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasproprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona FASES";
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

