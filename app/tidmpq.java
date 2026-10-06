package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tidmpq", "/app.tidmpq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tidmpq extends GXWebObjectStub
{
   public tidmpq( )
   {
   }

   public tidmpq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tidmpq.class ));
   }

   public tidmpq( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tidmpq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tidmpq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ASIGNACION PROCESOS IDM";
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

