package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rprti01", "/app.rprti01"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rprti01 extends GXWebObjectStub
{
   public rprti01( )
   {
   }

   public rprti01( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rprti01.class ));
   }

   public rprti01( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rprti01_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rprti01_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SITUACION PROCESOS TINTE";
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

