package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tftpqs", "/app.tftpqs"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tftpqs extends GXWebObjectStub
{
   public tftpqs( )
   {
   }

   public tftpqs( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tftpqs.class ));
   }

   public tftpqs( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tftpqs_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tftpqs_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "F.T. PQUIMICOS";
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

