package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfasdis", "/app.tfasdis"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfasdis extends GXWebObjectStub
{
   public tfasdis( )
   {
   }

   public tfasdis( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfasdis.class ));
   }

   public tfasdis( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfasdis_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfasdis_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "FASES DISPOSICION CLIENTE";
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

