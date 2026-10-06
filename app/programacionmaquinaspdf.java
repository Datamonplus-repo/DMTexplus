package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.programacionmaquinaspdf", "/app.programacionmaquinaspdf"})
@jakarta.servlet.annotation.MultipartConfig
public final  class programacionmaquinaspdf extends GXWebObjectStub
{
   public programacionmaquinaspdf( )
   {
   }

   public programacionmaquinaspdf( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( programacionmaquinaspdf.class ));
   }

   public programacionmaquinaspdf( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new programacionmaquinaspdf_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new programacionmaquinaspdf_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Programacion Maquinas PDF";
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

