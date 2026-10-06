package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tsimprq", "/app.tsimprq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tsimprq extends GXWebObjectStub
{
   public tsimprq( )
   {
   }

   public tsimprq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tsimprq.class ));
   }

   public tsimprq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tsimprq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tsimprq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "SIMULACION RECETAS Q P/FASES";
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

