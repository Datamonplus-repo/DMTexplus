package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tfaspq", "/app.tfaspq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfaspq extends GXWebObjectStub
{
   public tfaspq( )
   {
   }

   public tfaspq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfaspq.class ));
   }

   public tfaspq( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfaspq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfaspq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tratamientos Quimicos por Fase";
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

