package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfaspro", "/app.tfaspro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfaspro extends GXWebObjectStub
{
   public tfaspro( )
   {
   }

   public tfaspro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfaspro.class ));
   }

   public tfaspro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfaspro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfaspro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASES";
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

