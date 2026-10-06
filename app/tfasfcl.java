package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasfcl", "/app.tfasfcl"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasfcl extends GXWebObjectStub
{
   public tfasfcl( )
   {
   }

   public tfasfcl( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasfcl.class ));
   }

   public tfasfcl( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasfcl_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasfcl_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases Fact. por Cliente/Proc";
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

